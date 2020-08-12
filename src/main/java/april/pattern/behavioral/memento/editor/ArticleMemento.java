package april.pattern.behavioral.memento.editor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 备忘录
 *
 * @author yanzx
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ArticleMemento {
    private String title;
    private String content;
    private String img;
}
