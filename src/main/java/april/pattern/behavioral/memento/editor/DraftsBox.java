package april.pattern.behavioral.memento.editor;

import java.util.Stack;

/**
 * 草稿箱
 *
 * @author yanzx
 */
public class DraftsBox {
    private Stack<ArticleMemento> stack = new Stack<>();

    public ArticleMemento getMemento() {
        return stack.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        this.stack.push(articleMemento);
    }
}
