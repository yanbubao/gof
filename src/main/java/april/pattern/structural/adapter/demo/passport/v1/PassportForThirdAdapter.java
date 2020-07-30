package april.pattern.structural.adapter.demo.passport.v1;

import april.pattern.structural.adapter.demo.passport.IPassportForThird;
import april.pattern.structural.adapter.demo.passport.PassportService;
import april.pattern.structural.adapter.demo.passport.ResultMsg;

/**
 * @author yanzx
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {

    private ResultMsg login4Register(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.register(username, password);
        return super.login(username, password);
    }

    @Override
    public ResultMsg login4QQ(String openId) {
        return login4Register(openId, null);
    }

    @Override
    public ResultMsg login4WeChat(String openId) {
        return login4Register(openId, null);
    }

    @Override
    public ResultMsg login4Token(String token) {
        return login4Register(token, null);
    }

    @Override
    public ResultMsg login4Phone(String phone, String code) {
        return login4Register(phone, null);
    }

}
