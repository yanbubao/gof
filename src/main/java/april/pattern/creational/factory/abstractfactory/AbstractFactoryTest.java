package april.pattern.creational.factory.abstractfactory;

/**
 * @author yanzx
 * @date 2020/05/31 23:12
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();
    }
}
