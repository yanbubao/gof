package april.pattern.facade.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
