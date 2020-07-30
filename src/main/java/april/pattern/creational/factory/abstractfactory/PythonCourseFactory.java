package april.pattern.creational.factory.abstractfactory;

import april.pattern.creational.factory.INote;
import april.pattern.creational.factory.IVideo;
import april.pattern.creational.factory.PythonNote;
import april.pattern.creational.factory.PythonVideo;

/**
 * @author yanzx
 * @date 2020/05/31 23:11
 */
public class PythonCourseFactory extends CourseFactory {

    @Override
    INote createNote() {
        return new PythonNote();
    }

    @Override
    IVideo createVideo() {
        return new PythonVideo();
    }
}
