package april.pattern.structural.adapter.demo.passport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yanzx
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;
}
