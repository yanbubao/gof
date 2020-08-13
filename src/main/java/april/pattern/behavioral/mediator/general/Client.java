package april.pattern.behavioral.mediator.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        colleagueA.depMethodA();
        System.out.println("-------------------------");
        colleagueB.depMethodB();
    }
}
