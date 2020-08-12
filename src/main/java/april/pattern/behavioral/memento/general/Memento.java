package april.pattern.behavioral.memento.general;

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
public class Memento {
    private String state;
}
