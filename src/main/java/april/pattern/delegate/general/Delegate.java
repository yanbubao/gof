package april.pattern.delegate.general;

import java.util.Random;

/**
 * @author yanzx
 */
public class Delegate implements Task {
    @Override
    public void doAction() {
        System.out.println("代理执行开始....");
        Task task = null;
        if (new Random().nextBoolean()) {
            task = new ConcreteA();
        } else {
            task = new ConcreteB();
        }

        task.doAction();
        System.out.println("代理执行结束....");
    }
}
