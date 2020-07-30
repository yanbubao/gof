package april.pattern.behavioral.template.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new ConcreteA();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreteB();
        abstractTemplate.templateMethod();
    }
}
