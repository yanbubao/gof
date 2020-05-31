package april.pattern.factory.simplefactory;

import april.pattern.factory.ICourse;

/**
 * @author yanzx
 * @date 2020/05/31 22:22
 */
public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if(clazz != null){
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
