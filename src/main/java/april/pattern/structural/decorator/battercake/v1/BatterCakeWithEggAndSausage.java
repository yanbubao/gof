package april.pattern.structural.decorator.battercake.v1;

/**
 * @author yanzx
 */
public class BatterCakeWithEggAndSausage extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
