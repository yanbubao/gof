package april.pattern.proxy.dbroute.proxy;

import april.pattern.proxy.dbroute.IOrderService;
import april.pattern.proxy.dbroute.Order;
import april.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yanzx
 */
public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private final IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        Long createTime = order.getCreateTime();
        int dbRouter = Integer.parseInt(yearFormat.format(new Date(createTime)));

        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据..." );

        DynamicDataSourceEntity.set(dbRouter);
        int result = orderService.createOrder(order);
        DynamicDataSourceEntity.restore();

        return result;
    }
}
