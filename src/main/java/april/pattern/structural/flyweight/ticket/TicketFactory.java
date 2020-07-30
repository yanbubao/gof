package april.pattern.structural.flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yanzx
 */
public class TicketFactory {

    private final static Map<String, ITicket> ticketPool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (TicketFactory.ticketPool.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return TicketFactory.ticketPool.get(key);
        }
        System.out.println("首次查询，创建对象: " + key);
        ITicket ticket = new TrainTicket(from, to);
        TicketFactory.ticketPool.put(key, ticket);
        return ticket;
    }
}
