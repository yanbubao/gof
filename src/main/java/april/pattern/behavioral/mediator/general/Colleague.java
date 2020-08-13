package april.pattern.behavioral.mediator.general;

/**
 * 抽象同事类
 *
 * @author yanzx
 */
public abstract class Colleague {

    // 持有中介者
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
