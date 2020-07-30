package april.pattern.behavioral.delegate.simple;

/**
 * @author yanzx
 */
public class EmployeeB implements IEmployee {
    protected String goodAt = "平面设计";

    @Override
    public void doAction(String taskName) {
        System.out.println("我是员工B，我擅长" + goodAt + ",现在开始做" + taskName + "工作");
    }
}
