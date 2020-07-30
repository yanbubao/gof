package april.pattern.structural.flyweight.pool;

import java.sql.Connection;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        System.out.println(conn);
    }
}
