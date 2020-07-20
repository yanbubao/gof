package april.pattern.decorator.navsdemo;

/**
 * @author yanzx
 */
public class CommonNav implements INav {
    @Override
    public String showNavs() {
        return NavEnum.a.getDesc() +
                NavEnum.b.getDesc() +
                NavEnum.c.getDesc() +
                NavEnum.d.getDesc() +
                NavEnum.e.getDesc();
    }
}
