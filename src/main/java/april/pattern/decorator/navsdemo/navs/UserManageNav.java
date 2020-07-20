package april.pattern.decorator.navsdemo.navs;

import april.pattern.decorator.navsdemo.AbstractDecorator;
import april.pattern.decorator.navsdemo.INav;
import april.pattern.decorator.navsdemo.NavEnum;

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
