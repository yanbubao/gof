package april.pattern.decorator.battercake.v1;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() + ",总价：" + batterCake.getPrice());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() + ",总价：" + batterCakeWithEgg.getPrice());

        BatterCakeWithEggAndSausage batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg() + ",总价：" + batterCakeWithEggAndSausage.getPrice());
    }
}
