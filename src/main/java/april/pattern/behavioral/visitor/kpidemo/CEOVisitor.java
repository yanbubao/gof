package april.pattern.behavioral.visitor.kpidemo;

import april.pattern.behavioral.visitor.kpidemo.role.Engineer;
import april.pattern.behavioral.visitor.kpidemo.role.Manager;

/**
 * @author yanzx
 */
public class CEOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(
                "工程师" + engineer.getName()
                        + "，KPI：" + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(
                "经理：" + manager.getName()
                + ",KPI:" + manager.getKpi()
                + "，产品数量：" + manager.getProducts());

    }
}
