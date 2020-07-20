package april.pattern.decorator.battercake.v1;

/**
 * @author yanzx
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
