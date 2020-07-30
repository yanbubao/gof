package april.pattern.structural.decorator.navsdemo;

/**
 * @author yanzx
 */
public class AbstractDecorator implements INav {

    protected INav nav;

    public AbstractDecorator(INav nav) {
        this.nav = nav;
    }

    @Override
    public String showNavs() {
        return this.nav.showNavs();
    }
}
