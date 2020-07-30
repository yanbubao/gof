package april.pattern.creational.prototype.shallow;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 浅克隆，实现jdk中的Cloneable
 *
 * @author yanzx
 * @see Cloneable
 */
@Data
@ToString
public class ConcretePrototype implements Cloneable {

    private int age;
    private String name;
    private List<String> list;

    /**
     * 浅克隆
     *
     * @return prototype
     * @throws CloneNotSupportedException
     */
    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }
}
