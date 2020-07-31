package april.pattern.behavioral.chain.auth.optimiaze;

import april.pattern.behavioral.chain.auth.Member;

/**
 * @author yanzx
 */
public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    protected abstract void doHandler(Member member);
}
