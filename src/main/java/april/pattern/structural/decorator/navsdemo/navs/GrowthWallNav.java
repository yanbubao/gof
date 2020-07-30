package april.pattern.structural.decorator.navsdemo.navs;

import april.pattern.structural.decorator.navsdemo.AbstractDecorator;
import april.pattern.structural.decorator.navsdemo.INav;
import april.pattern.structural.decorator.navsdemo.NavEnum;

/**
 * @author yanzx
 */
public class GrowthWallNav extends AbstractDecorator {
    public GrowthWallNav(INav nav) {
        super(nav);
    }

    @Override
    public String showNavs() {
        return super.showNavs() + NavEnum.h.getDesc();
    }
}
