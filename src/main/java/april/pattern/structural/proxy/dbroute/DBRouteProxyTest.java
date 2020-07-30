package april.pattern.structural.proxy.dbroute;

import april.pattern.structural.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yanzx
 */
public class DBRouteProxyTest {
    public static void main(String[] args) throws Exception {

        Order order = new Order();
        //order.setCreateTime(new Date().getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2008/03/01");
        order.setCreateTime(date.getTime());

        // 静态代理
        // IOrderService proxyService = new OrderServiceStaticProxy(new OrderService());

        // 动态代理
        IOrderService proxyService = (IOrderService) new OrderServiceDynamicProxy().newInstance(new OrderService());
        proxyService.createOrder(order);

    }
}
