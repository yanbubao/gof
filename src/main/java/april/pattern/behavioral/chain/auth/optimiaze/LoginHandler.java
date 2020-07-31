package april.pattern.behavioral.chain.auth.optimiaze;

import april.pattern.behavioral.chain.auth.Member;

/**
 * @author yanzx
 */
public class LoginHandler extends Handler {
    @Override
    protected void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        next.doHandler(member);
    }
}
