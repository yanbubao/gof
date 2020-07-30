package april.pattern.behavioral.template.general;

/**
 * @author yanzx
 */
public abstract class AbstractTemplate {

    protected void step1() {
        System.out.println("AbstractTemplate:step1");
    }

    protected void step2() {
        System.out.println("AbstractTemplate:step2");
    }

    protected void step3() {
        System.out.println("AbstractTemplate:step3");
    }

    /**
     * 声明为final方法，避免子类覆写
     */
    public final void templateMethod() {
        this.step1();
        this.step2();
        this.step3();
    }
}
