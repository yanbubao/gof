package april.pattern.behavioral.chain.auth.builderchain;

import april.pattern.behavioral.chain.auth.Member;

/**
 * @author yanzx
 */
public class LoginHandler extends Handler<Member> {
    @Override
    protected void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        if(null != next) {
            next.doHandler(member);
        }
    }
}
