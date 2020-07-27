package april.pattern.adapter.demo.passport.v2.adapters;

import april.pattern.adapter.demo.passport.ResultMsg;

/**
 * @author yanzx
 */
public interface ILoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
