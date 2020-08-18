package april.pattern.behavioral.observer.gper;

import lombok.Getter;

import java.util.Observable;

/**
 * 被观察者，继承JDK接口
 *
 * @author yanzx
 * @see java.util.Observable
 */
@Getter
public class GPer extends Observable {

    private static final GPer instance = new GPer();

    private final String name = "GPer生态圈";

    private GPer() {
    }

    public static GPer getInstance() {
        return instance;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
