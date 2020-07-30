package april.pattern.structural.proxy.dynamicproxy.jdkproxy;

import april.pattern.structural.proxy.IPerson;
import april.pattern.structural.proxy.dynamicproxy.IMkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yanzx
 */
public class JdkMkProxy implements InvocationHandler, IMkProxy {

    private IPerson target;

    /**
     * 获取代理对象
     *
     * @param target
     * @return proxy
     */
    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

}
