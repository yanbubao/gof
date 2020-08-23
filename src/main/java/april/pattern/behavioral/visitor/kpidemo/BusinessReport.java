package april.pattern.behavioral.visitor.kpidemo;

import april.pattern.behavioral.visitor.kpidemo.role.Employee;
import april.pattern.behavioral.visitor.kpidemo.role.Engineer;
import april.pattern.behavioral.visitor.kpidemo.role.Manager;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author yanzx
 */
public class BusinessReport {

    private List<Employee> employees = Lists.newArrayList();

    public BusinessReport() {
        employees.add(new Manager("产品经理A"));
        employees.add(new Engineer("程序员A"));
        employees.add(new Engineer("程序员B"));
        employees.add(new Engineer("程序员C"));
        employees.add(new Manager("产品经理B"));
        employees.add(new Engineer("程序员D"));
    }

    public void showReport(IVisitor visitor) {
        employees.forEach(e -> e.accept(visitor));
    }
}
