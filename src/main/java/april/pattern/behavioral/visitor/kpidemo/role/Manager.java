package april.pattern.behavioral.visitor.kpidemo.role;

import april.pattern.behavioral.visitor.kpidemo.IVisitor;

import java.util.Random;

/**
 * @author yanzx
 */
public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核的是每年新产品研发数量
     *
     * @return
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
