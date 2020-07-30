package april.pattern.structural.decorator.navsdemo.navs;

import april.pattern.structural.decorator.navsdemo.AbstractDecorator;
import april.pattern.structural.decorator.navsdemo.INav;
import april.pattern.structural.decorator.navsdemo.NavEnum;

/**
 * 用户管理导航装饰
 * @author yanzx
 */
public class UserManageNav extends AbstractDecorator {
    public UserManageNav(INav nav) {
        super(nav);
    }

    @Override
    public String showNavs() {
        return super.showNavs() + NavEnum.i.getDesc();
    }
}
