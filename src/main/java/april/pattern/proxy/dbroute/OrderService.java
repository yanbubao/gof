package april.pattern.proxy.dbroute;

/**
 * @author yanzx
 */
public class OrderService implements IOrderService {

    private final OrderDao orderDao;

    /**
     * 模拟Spring DI.
     */
    public OrderService() {
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        return orderDao.insert(order);
    }
}
