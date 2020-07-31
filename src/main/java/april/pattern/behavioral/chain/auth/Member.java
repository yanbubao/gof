package april.pattern.behavioral.chain.auth;

import lombok.Data;
import lombok.ToString;

/**
 * @author yanzx
 */
@Data
@ToString
public class Member {
    private String loginName;
    private String loginPass;
    private String roleName;

    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }
}
