package april.pattern.structural.decorator.battercake.v2;

/**
 * @author yanzx
 */
public class BaseBatterCake extends BatterCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
