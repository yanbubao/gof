package april.pattern.behavioral.strategy.paydemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yanzx
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String uid;
    private String orderId;
    private Double amount;
}
