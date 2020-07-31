package april.pattern.behavioral.chain.general;

/**
 * @author yanzx
 */
public class ConcreteHandlerB extends Handler {

    @Override
    protected void handleRequest(String request) {
        if ("requestB".equals(request)) {
            System.out.println(this.getClass().getSimpleName() + "deal with request: " + request);
            return;
        }
        if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        }
    }
}
