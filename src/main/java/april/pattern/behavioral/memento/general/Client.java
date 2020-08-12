package april.pattern.behavioral.memento.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        // 发起人
        Originator originator = new Originator();
        // 备忘录管理者
        Caretaker caretaker = new Caretaker();
        // 管理员存储发起人的备忘录
        caretaker.saveMemento(originator.createMemento());
        // 发起人从管理员获取备忘录进行回滚
        originator.restoreMemento(caretaker.getMemento());
    }
}
