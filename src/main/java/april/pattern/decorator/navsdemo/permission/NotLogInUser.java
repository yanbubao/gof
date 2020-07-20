package april.pattern.decorator.navsdemo.permission;

import april.pattern.decorator.navsdemo.CommonNav;

/**
 * 未登录用户， 拥有CommonNav
 *
 * @author yanzx
 */
public class NotLogInUser implements IPermission {
    @Override
    public String showPermNavs() {
        return new CommonNav().showNavs();
    }
}
