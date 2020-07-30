package april.pattern.structural.decorator.navsdemo.permission;

import april.pattern.structural.decorator.navsdemo.CommonNav;
import april.pattern.structural.decorator.navsdemo.navs.QuestionNav;

/**
 * 已登录用户: 基本导航 CommonNav + 题库(QuestionNav)
 *
 * @author yanzx
 */
public class LogInUser implements IPermission {
    @Override
    public String showPermNavs() {
        return new QuestionNav(new CommonNav()).showNavs();
    }
}
