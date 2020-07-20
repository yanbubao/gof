package april.pattern.decorator.navsdemo.navs;

import april.pattern.decorator.navsdemo.AbstractDecorator;
import april.pattern.decorator.navsdemo.INav;
import april.pattern.decorator.navsdemo.NavEnum;

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
