package april.pattern.behavioral.visitor.kpidemo.role;

import april.pattern.behavioral.visitor.kpidemo.IVisitor;
import lombok.Data;

import java.util.Random;

/**
 * @author yanzx
 */
@Data
public abstract class Employee {

    protected String name;
    protected Integer kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(IVisitor visitor);
}
