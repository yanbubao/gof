package april.pattern.decorator.navsdemo.permission;

import april.pattern.decorator.navsdemo.CommonNav;
import april.pattern.decorator.navsdemo.navs.QuestionNav;

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
