package april.pattern.structural.adapter.demo.passport.v2.adapters;

import april.pattern.structural.adapter.demo.passport.PassportService;
import april.pattern.structural.adapter.demo.passport.ResultMsg;

/**
 * @author yanzx
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {

    protected ResultMsg loginForRegister(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.register(username, password);
        return super.login(username, password);
    }
}
