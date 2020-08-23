package april.pattern.behavioral.visitor.general;

import java.util.Random;

/**
 * @author yanzx
 */
public class ConcreteElementB implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int operationB() {
        return new Random().nextInt(100);
    }
}
