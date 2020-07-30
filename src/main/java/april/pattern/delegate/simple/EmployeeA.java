package april.pattern.delegate.simple;

/**
 * @author yanzx
 */
public class EmployeeA implements IEmployee {
    protected String goodAt = "编程";

    @Override
    public void doAction(String taskName) {
        System.out.println("我是员工A，我擅长" + goodAt + ",现在开始做" + taskName + "工作");
    }
}
