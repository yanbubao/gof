package april.pattern.structural.decorator.navsdemo.permission;

import april.pattern.structural.decorator.navsdemo.CommonNav;
import april.pattern.structural.decorator.navsdemo.navs.GrowthWallNav;
import april.pattern.structural.decorator.navsdemo.navs.QuestionNav;
import april.pattern.structural.decorator.navsdemo.navs.TaskNav;
import april.pattern.structural.decorator.navsdemo.navs.UserManageNav;

/**
 * @author yanzx
 */
public class Admin implements IPermission {
    @Override
    public String showPermNavs() {
        return new UserManageNav(new GrowthWallNav(new QuestionNav(new TaskNav(new CommonNav())))).showNavs();
    }
}
