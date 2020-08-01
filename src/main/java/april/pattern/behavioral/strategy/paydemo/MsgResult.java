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
public class MsgResult {
    private int code;
    private Object data;
    private String msg;
}
