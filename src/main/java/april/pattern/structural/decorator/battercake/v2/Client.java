package april.pattern.structural.decorator.battercake.v2;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {

        BatterCake batterCake;

        batterCake = new BaseBatterCake();

        batterCake = new EggDecorator(batterCake);

        batterCake = new SausageDecorator(batterCake);

        System.out.println(batterCake.getMsg() + "，总价" + batterCake.getPrice());
    }
}
