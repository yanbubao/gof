package april.pattern.structural.adapter.demo.passport.v2.adapters;

import april.pattern.structural.adapter.demo.passport.ResultMsg;

/**
 * @author yanzx
 */
public class LoginForTokenAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegister(id, null);
    }
}
