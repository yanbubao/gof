package april.pattern.structural.adapter.demo.passport.v2.adapters;

import april.pattern.structural.adapter.demo.passport.ResultMsg;

/**
 * @author yanzx
 */
public interface ILoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
