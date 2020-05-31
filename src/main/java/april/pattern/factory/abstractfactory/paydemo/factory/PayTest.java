package april.pattern.factory.abstractfactory.paydemo.factory;

/**
 * @author yanzx
 * @date 2020/05/31 23:29
 */
public class PayTest {

    public static void main(String[] args) {

        ChinaPayFactory factory = new ChinaPayFactory();

        factory.chinaPay().pay();
    }
}
