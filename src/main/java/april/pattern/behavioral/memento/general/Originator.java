package april.pattern.behavioral.memento.general;

import lombok.Data;

/**
 * @author yanzx
 */
@Data
public class Originator {

    /**
     * 内部状态
     */
    private String state;

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
