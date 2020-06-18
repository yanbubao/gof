package april.pattern.builder.chain;

import april.pattern.builder.simple.Course;

/**
 * @author yanzx
 */
public class CourseBuilder {

    private Course course = new Course();

    public Course build() {
        return this.course;
    }

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder addPPT(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBuilder addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

}
