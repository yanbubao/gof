package april.pattern.adapter.demo.passport;

/**
 * @author yanzx
 */
public interface IPassportForThird {

    ResultMsg login4QQ(String openId);

    ResultMsg login4WeChat(String openId);

    ResultMsg login4Token(String token);

    ResultMsg login4Phone(String phone, String code);
}
