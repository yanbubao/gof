package april.pattern.behavioral.state.statemachine;

/**
 * 订单状态改变事件
 *
 * @author yanzx
 */
public enum OrderStatusChangeEvent {
    // 支付，发货，确认收货
    PAYED, DELIVERY, RECEIVED;
}
