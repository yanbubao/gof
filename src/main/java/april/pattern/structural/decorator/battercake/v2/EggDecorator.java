package april.pattern.structural.decorator.battercake.v2;

/**
 * @author yanzx
 */
public class EggDecorator extends BatterCakeDecorator {

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
