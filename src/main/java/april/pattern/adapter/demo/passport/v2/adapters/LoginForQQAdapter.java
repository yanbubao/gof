package april.pattern.adapter.demo.passport.v2.adapters;

import april.pattern.adapter.demo.passport.ResultMsg;

/**
 * @author yanzx
 */
public class LoginForQQAdapter extends AbstractAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegister(id, null);
    }
}
