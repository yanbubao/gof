package april.pattern.behavioral.state.statemachine;

import lombok.Data;
import lombok.ToString;

/**
 * @author yanzx
 */
@Data
@ToString
public class Order {
    private int id;
    private OrderStatus status;
}
