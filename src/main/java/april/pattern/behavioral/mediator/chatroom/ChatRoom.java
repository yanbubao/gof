package april.pattern.behavioral.mediator.chatroom;

/**
 * 中介者角色
 *
 * @author yanzx
 */
public class ChatRoom {
    public void showMsg(User user,String msg){
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
