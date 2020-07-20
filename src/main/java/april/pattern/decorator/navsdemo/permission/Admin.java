package april.pattern.decorator.navsdemo.permission;

import april.pattern.decorator.navsdemo.CommonNav;
import april.pattern.decorator.navsdemo.navs.GrowthWallNav;
import april.pattern.decorator.navsdemo.navs.QuestionNav;
import april.pattern.decorator.navsdemo.navs.TaskNav;
import april.pattern.decorator.navsdemo.navs.UserManageNav;

/**
 * @author yanzx
 */
public class Admin implements IPermission {
    @Override
    public String showPermNavs() {
        return new UserManageNav(new GrowthWallNav(new QuestionNav(new TaskNav(new CommonNav())))).showNavs();
    }
}
