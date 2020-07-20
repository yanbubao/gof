package april.pattern.decorator.navsdemo.navs;

import april.pattern.decorator.navsdemo.AbstractDecorator;
import april.pattern.decorator.navsdemo.INav;
import april.pattern.decorator.navsdemo.NavEnum;

/**
 * 作业导航装饰
 *
 * @author yanzx
 */
public class TaskNav extends AbstractDecorator {
    public TaskNav(INav nav) {
        super(nav);
    }

    @Override
    public String showNavs() {
        return super.showNavs() + NavEnum.f.getDesc();
    }
}
