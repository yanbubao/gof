package april.pattern.behavioral.state.statemachine;

/**
 * 订单状态机配置类
 *
 * @author yanzx
 */
@Configuration
@EnableStateMachine(name = "orderStateMachine")
public class OrderStateMachineConfig extends StateMachineConfigurerAdapter<OrderStatus, OrderStatusChangeEvent> {
}
