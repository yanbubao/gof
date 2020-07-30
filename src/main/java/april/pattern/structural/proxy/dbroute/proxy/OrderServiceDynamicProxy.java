package april.pattern.structural.proxy.dbroute.proxy;

import april.pattern.structural.proxy.dbroute.db.DynamicDataSourceEntity;
import april.pattern.structural.proxy.dynamicproxy.myproxy.proxy.MyClassLoader;
import april.pattern.structural.proxy.dynamicproxy.myproxy.proxy.MyInvocationHandler;
import april.pattern.structural.proxy.dynamicproxy.myproxy.proxy.MyProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yanzx
 */
public class OrderServiceDynamicProxy implements MyInvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private Object target;

    public Object newInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("Proxy after method");
        // 还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    /**
     * before 进行数据源的切换
     *
     * @param target 是订单对象Order
     */
    private void before(Object target) {
        try {
            System.out.println("Proxy before method");
            // 约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            int dbRouter = Integer.parseInt(yearFormat.format(new Date(time)));
            System.out.println("动态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
