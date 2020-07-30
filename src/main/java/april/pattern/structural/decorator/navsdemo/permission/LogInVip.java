package april.pattern.structural.decorator.navsdemo.permission;

import april.pattern.structural.decorator.navsdemo.CommonNav;
import april.pattern.structural.decorator.navsdemo.navs.GrowthWallNav;
import april.pattern.structural.decorator.navsdemo.navs.QuestionNav;
import april.pattern.structural.decorator.navsdemo.navs.TaskNav;

/**
 * 已登录会员： 基本导航(CommonNav + QuestionNav + TaskNav + GrowthWallNav)
 *
 * @author yanzx
 */
public class LogInVip implements IPermission {
    @Override
    public String showPermNavs() {
        return new GrowthWallNav(new QuestionNav(new TaskNav(new CommonNav()))).showNavs();
    }
}
