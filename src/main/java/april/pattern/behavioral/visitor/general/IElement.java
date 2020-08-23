package april.pattern.behavioral.visitor.general;

/**
 * 被访问的抽象元素
 *
 * @author yanzx
 */
public interface IElement {
    void accept(IVisitor visitor);
}
