package april.pattern.structural.adapter.demo.passport.v2.adapters;

import april.pattern.structural.adapter.demo.passport.ResultMsg;

/**
 * @author yanzx
 */
public class LoginForWeChatAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegister(id, null);
    }
}
