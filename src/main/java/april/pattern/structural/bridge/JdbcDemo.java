package april.pattern.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * DriverManager作为桥梁实现了jdk和MySQL之间的对接
 * <p>
 * jdk侧：抽象方
 * MySQL侧：具体实现
 *
 * @author yanzx
 */
public class JdbcDemo {
    public static void main(String[] args) {
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");  //反射机制加载驱动类
            // 2.获取连接Connection
            //主机:端口号/数据库名
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            // 3.得到执行sql语句的对象Statement
            Statement stmt = conn.createStatement();
            // 4.执行sql语句，并返回结果
            ResultSet rs = stmt.executeQuery("select * from table");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
