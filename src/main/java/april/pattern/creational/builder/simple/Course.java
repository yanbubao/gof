package april.pattern.creational.builder.simple;

import lombok.Data;
import lombok.ToString;

/**
 * @author yanzx
 */
@Data
@ToString
public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;
}
