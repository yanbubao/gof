package april.pattern.behavioral.visitor.kpidemo;

import april.pattern.behavioral.visitor.kpidemo.role.Engineer;
import april.pattern.behavioral.visitor.kpidemo.role.Manager;

/**
 * @author yanzx
 */
public interface IVisitor {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
