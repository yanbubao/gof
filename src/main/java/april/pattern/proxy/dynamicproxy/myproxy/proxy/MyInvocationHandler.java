package april.pattern.proxy.dynamicproxy.myproxy.proxy;

import java.lang.reflect.Method;

/**
 * @author yanzx
 */
public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
