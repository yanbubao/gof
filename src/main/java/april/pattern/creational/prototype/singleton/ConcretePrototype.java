package april.pattern.creational.prototype.singleton;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author yanzx
 */
@Data
@ToString
public class ConcretePrototype implements Cloneable {

    private int age;
    private String name;
    private List<String> hobbies;

    private static ConcretePrototype instance = new ConcretePrototype();

    private ConcretePrototype() {
    }

    public static ConcretePrototype getInstance() {
        return instance;
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return instance;
    }
}
