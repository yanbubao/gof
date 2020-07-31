package april.pattern.behavioral.chain.general;

/**
 * @author yanzx
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleRequest(String request);
}
