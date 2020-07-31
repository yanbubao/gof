package april.pattern.behavioral.chain.auth.builderchain;

import april.pattern.behavioral.chain.auth.Member;

/**
 * @author yanzx
 */
public class MemberService {
    public void login(String loginName, String loginPass){
        Handler.Builder<Member> builder = new Handler.Builder<>();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());

        builder.build().doHandler(new Member(loginName, loginPass));
    }
}
