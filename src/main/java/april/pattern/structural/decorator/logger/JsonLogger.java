package april.pattern.structural.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * JsonLogger 将log转换为json格式输出
 *
 * @author yanzx
 */
public class JsonLogger extends LoggerDecorator {

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject result = newJsonObject();
        result.put("message", s);
        logger.info(result.toString());
    }

    @Override
    public void error(String s) {
        JSONObject result = newJsonObject();
        result.put("message", s);
        logger.info(result.toString());
    }

    public void error(Exception e) {
        JSONObject result = newJsonObject();
        result.put("exception", e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        result.put("starkTrace", trace);
        logger.info(result.toString());
    }

    private JSONObject newJsonObject() {
        return new JSONObject();
    }

}
