package april.pattern.creational.prototype.demo;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {

        ExamPaper copy = (ExamPaper) BeanUtils.copy(new ExamPaper());

        System.out.println(copy);
    }
}
