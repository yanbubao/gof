package april.pattern.structural.flyweight.ticket;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西", "长沙");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("北京西", "长沙");
        ticket.showInfo("软座");
        ticket = TicketFactory.queryTicket("北京西", "长沙");
        ticket.showInfo("硬卧");
    }
}
