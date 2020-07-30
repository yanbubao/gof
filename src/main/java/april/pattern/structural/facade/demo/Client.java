package april.pattern.structural.facade.demo;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {
        new FacadeService().exchange(new GiftInfo("《Spring 5核心原理》"));
    }
}
