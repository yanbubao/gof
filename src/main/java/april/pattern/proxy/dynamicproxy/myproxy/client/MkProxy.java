package april.pattern.proxy.dynamicproxy.myproxy.client;

import april.pattern.proxy.IPerson;
import april.pattern.proxy.dynamicproxy.IMkProxy;
import april.pattern.proxy.dynamicproxy.myproxy.proxy.MyClassLoader;
import april.pattern.proxy.dynamicproxy.myproxy.proxy.MyInvocationHandler;
import april.pattern.proxy.dynamicproxy.myproxy.proxy.MyProxy;

import java.lang.reflect.Method;

/**
 * @author yanzx
 */
public class MkProxy implements MyInvocationHandler, IMkProxy {

    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<? extends IPerson> clazz = target.getClass();
        return (IPerson) MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }
}
