package april.pattern.behavioral.visitor.general;

/**
 * 通过扩展重载方法实现对更多元素的访问
 *
 * @author yanzx
 */
public interface IVisitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
