package april.pattern.behavioral.chain.auth.builderchain;

import april.pattern.behavioral.chain.auth.Member;
import org.apache.commons.lang.StringUtils;

/**
 * @author yanzx
 */
public class ValidateHandler extends Handler<Member> {
    @Override
    protected void doHandler(Member member) {
        if(StringUtils.isEmpty(member.getLoginName()) ||
                StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        if(null != next) {
            next.doHandler(member);
        }
    }
}
