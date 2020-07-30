package april.pattern.structural.decorator.navsdemo;

import april.pattern.structural.decorator.navsdemo.permission.*;

/**
 * 使用装饰器模式实现带有权限控制的页面导航栏显示功能！
 * <p>
 * <p>
 * 假设目前导航条功能有以下几种：
 * 1. 问答
 * 2. 文章
 * 3. 精品课
 * 4. 冒泡
 * 5. 商城
 * 6. 作业
 * 7. 题库
 * 8. 成长墙
 * 9. 用户管理
 * <p>
 * 权限包括：
 * A. 未登录用户
 * B. 已登录普通用户
 * C. 已登录会员用户
 * D. 管理员
 * <p>
 * <p>
 * 不同权限拥有导航条关系如下：
 * A -> 1,2,3,4,5
 * B -> 1,2,3,4,5,7
 * C -> 1,2,3,4,5,6,7,8
 * D -> 1,2,3,4,5,6,7,8,9
 * <p>
 * 则可以认为所有的权限都具有 1,2,3,4,5导航，
 * 并可将其抽象为原始组件的基本功能。 而6,7,8,9功能为根据不同
 * 权限设置上去， 即装饰的功能。 则实际的装饰器就有四种
 *
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {

        IPermission notLogInUser = new NotLogInUser();
        System.out.println("未登录用户导航条：");
        System.out.println(notLogInUser.showPermNavs());
        System.out.println("===========================");

        IPermission logInUser = new LogInUser();
        System.out.println("已登录用户导航条：");
        System.out.println(logInUser.showPermNavs());
        System.out.println("===========================");

        IPermission logInVip = new LogInVip();
        System.out.println("已登录会员导航条：");
        System.out.println(logInVip.showPermNavs());
        System.out.println("===========================");

        IPermission admin = new Admin();
        System.out.println("管理员导航条：");
        System.out.println(admin.showPermNavs());
        System.out.println("===========================");
    }
}
