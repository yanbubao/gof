package april.pattern.structural.adapter.demo.passport.v2;

import april.pattern.structural.adapter.demo.passport.IPassportForThird;
import april.pattern.structural.adapter.demo.passport.ResultMsg;
import april.pattern.structural.adapter.demo.passport.v2.adapters.*;

/**
 * @author yanzx
 */
public class PassportForThirdAdapter implements IPassportForThird {

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ResultMsg login4QQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg login4WeChat(String openId) {
        return processLogin(openId, LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg login4Token(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg login4Phone(String phone, String code) {
        return processLogin(phone, LoginForPhoneAdapter.class);
    }
}
