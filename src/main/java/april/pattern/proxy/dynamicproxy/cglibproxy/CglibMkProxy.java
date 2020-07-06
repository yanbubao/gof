package april.pattern.proxy.dynamicproxy.cglibproxy;

import april.pattern.proxy.dynamicproxy.IMkProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yanzx
 */
public class CglibMkProxy implements MethodInterceptor, IMkProxy {

    /**
     * 创建代理对象
     *
     * @param clazz
     * @return
     */
    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }
}
