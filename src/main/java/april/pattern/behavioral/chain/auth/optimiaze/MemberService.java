package april.pattern.behavioral.chain.auth.optimiaze;

import april.pattern.behavioral.chain.auth.Member;

/**
 * @author yanzx
 */
public class MemberService {
    public void login(String loginName, String loginPass) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        // set chain
        validateHandler.setNext(loginHandler);
        loginHandler.setNext(authHandler);

        validateHandler.doHandler(new Member(loginName, loginPass));
    }
}
