package april.pattern.prototype.general;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("yanzx");

        System.out.println(concretePrototype);

        ConcretePrototype clone = concretePrototype.clone();

        System.out.println(clone);
    }
}
