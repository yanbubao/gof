package april.pattern.factory.abstractfactory;

import april.pattern.factory.INote;
import april.pattern.factory.IVideo;
import april.pattern.factory.PythonNote;
import april.pattern.factory.PythonVideo;

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
