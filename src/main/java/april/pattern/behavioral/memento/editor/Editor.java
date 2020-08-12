package april.pattern.behavioral.memento.editor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 编辑角色
 *
 * @author yanzx
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Editor {
    private String title;
    private String content;
    private String img;

    public ArticleMemento saveToMemento() {
        return new ArticleMemento(this.title, this.content, this.img);
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.img = articleMemento.getImg();
    }

}
