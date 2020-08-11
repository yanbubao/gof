package april.pattern.behavioral.command.ftpdemo;

import java.util.Scanner;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        CommandContext context = new CommandContext();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的ftp命令:");
        while (scanner.hasNextLine()) {
            String commandName = scanner.next();
            if ("exit".equals(commandName)) {
                System.out.println("退出ftp服务...");
                System.exit(0);
            }
            context.sendCommand(commandName);
        }
    }
}
