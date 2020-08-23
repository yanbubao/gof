package april.pattern.behavioral.visitor.kpidemo.role;

import april.pattern.behavioral.visitor.kpidemo.IVisitor;

import java.util.Random;

/**
 * @author yanzx
 */
public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核指标是每年的代码量
     *
     * @return
     */
    public int calCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
