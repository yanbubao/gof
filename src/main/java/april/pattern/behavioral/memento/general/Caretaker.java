package april.pattern.behavioral.memento.general;

/**
 * 备忘录管理类
 *
 * @author yanzx
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
