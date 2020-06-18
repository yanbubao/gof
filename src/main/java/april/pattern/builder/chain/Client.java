package april.pattern.builder.chain;

import april.pattern.builder.simple.Course;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {

        Course course = new CourseBuilder()
                .addName("设计模式")
                .addPPT("【PPT课件】")
                .addVideo("【回放视频】")
                .addNote("【课堂笔记】")
                .addHomework("【课后作业】")
                .build();

        System.out.println(course);
    }
}
