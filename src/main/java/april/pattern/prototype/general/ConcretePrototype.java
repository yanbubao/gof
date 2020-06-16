package april.pattern.prototype.general;

import lombok.Data;
import lombok.ToString;

/**
 * @author yanzx
 */
@Data
@ToString
public class ConcretePrototype implements IPrototype<ConcretePrototype> {

    private int age;
    private String name;

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        return concretePrototype;

    }
}
