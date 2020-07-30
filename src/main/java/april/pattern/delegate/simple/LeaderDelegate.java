package april.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Leader作为委派角色
 *
 * @author yanzx
 */
public class LeaderDelegate implements IEmployee {

    private final Map<String, IEmployee> taskMap = new HashMap<>();

    public LeaderDelegate() {
        this.taskMap.put("编程", new EmployeeA());
        this.taskMap.put("平面设计", new EmployeeB());
    }

    @Override
    public void doAction(String taskName) {
        if (!taskMap.containsKey(taskName)) {
            System.out.println("无此职能！" + taskName);
            return;
        }
        this.taskMap.get(taskName).doAction(taskName);
    }
}
