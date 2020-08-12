package april.pattern.behavioral.state.general.simple;

/**
 * @author yanzx
 */
public class ConcreteStateB implements IState {
    @Override
    public void handle() {
        //必要时刻需要进行状态切换
        System.out.println("StateB do action");
    }
}
