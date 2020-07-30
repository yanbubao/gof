package april.pattern.creational.builder.simple;

/**
 * @author yanzx
 */
public class CourseBuilder {

    private Course course = new Course();

    public Course build(){
        return this.course;
    }

    public void addName(String name) {
        course.setName(name);
    }

    public void addPPT(String ppt) {
        course.setPpt(ppt);
    }

    public void addVideo(String video) {
        course.setVideo(video);
    }

    public void addNote(String note) {
        course.setNote(note);
    }

    public void addHomework(String homework) {
        course.setHomework(homework);
    }
}
