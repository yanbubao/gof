package april.pattern.behavioral.chain.auth.builderchain;

import april.pattern.behavioral.chain.auth.Member;

/**
 * @author yanzx
 */
public class AuthHandler extends Handler<Member> {
    @Override
    protected void doHandler(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");
    }
}
