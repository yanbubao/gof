package april.pattern.behavioral.mediator.chatroom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yanzx
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private ChatRoom chatRoom;

    public void sendMessage(String msg) {
        this.chatRoom.showMsg(this, msg);
    }

}
