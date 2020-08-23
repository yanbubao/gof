package april.pattern.behavioral.visitor.general;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author yanzx
 */
public class ObjectStructure {

    private List<IElement> elements = Lists.newArrayList();

    {
        this.elements.add(new ConcreteElementA());
        this.elements.add(new ConcreteElementB());
    }

    public void accept(IVisitor visitor) {
        this.elements.forEach(e -> e.accept(visitor));
    }
}
