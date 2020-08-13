package april.pattern.behavioral.mediator.general;

/**
 * 抽象中介者类
 *
 * @author yanzx
 */
public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleague) {
        this.colleagueA = colleague;
    }

    public void setColleagueB(ConcreteColleagueB colleague) {
        this.colleagueB = colleague;
    }

    // 中介者业务逻辑
    public abstract void transferA();

    public abstract void transferB();
}
