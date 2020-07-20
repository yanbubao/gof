package april.pattern.decorator.logger;

import java.io.*;

/**
 * @author yanzx
 */
public class Client {

    private final static JsonLogger logger = JsonLoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        logger.error("系统错误！");

        logger.error(new RuntimeException());

        /**
         * JDK中包装器的使用示例
         */
        try {
            InputStream in = new FileInputStream("");

            BufferedInputStream bis = new BufferedInputStream(in);

            bis.read();
            bis.close();

            BufferedReader br = new BufferedReader(new FileReader(""));
            br.readLine();

            BufferedReader bs = new BufferedReader(new StringReader(""));
            bs.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
