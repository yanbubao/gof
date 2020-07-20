package april.pattern.decorator.navsdemo.navs;

import april.pattern.decorator.navsdemo.AbstractDecorator;
import april.pattern.decorator.navsdemo.INav;
import april.pattern.decorator.navsdemo.NavEnum;

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
