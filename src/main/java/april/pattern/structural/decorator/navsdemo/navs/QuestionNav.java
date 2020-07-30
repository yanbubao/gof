package april.pattern.structural.decorator.navsdemo.navs;

import april.pattern.structural.decorator.navsdemo.AbstractDecorator;
import april.pattern.structural.decorator.navsdemo.INav;
import april.pattern.structural.decorator.navsdemo.NavEnum;

/**
 * 题库导航装饰
 *
 * @author yanzx
 */
public class QuestionNav extends AbstractDecorator {

    public QuestionNav(INav nav) {
        super(nav);
    }

    @Override
    public String showNavs() {
        return nav.showNavs() + NavEnum.g.getDesc();
    }
}
