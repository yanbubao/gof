package april.pattern.decorator.navsdemo;

/**
 * @author yanzx
 */
public enum NavEnum {
    a(1,"问答 "),
    b(2,"文章 "),
    c(3,"精品课 "),
    d(4,"冒泡 "),
    e(5,"商城 "),
    f(6,"作业 "),
    g(7,"题库 "),
    h(8,"成长墙 "),
    i(9,"用户管理 ");

    private Integer code;
    private String desc;

    NavEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
