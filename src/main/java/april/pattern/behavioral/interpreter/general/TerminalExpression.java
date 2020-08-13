package april.pattern.behavioral.interpreter.general;

/**
 * @author yanzx
 */
public class TerminalExpression implements IExpression {
    private Object value;

    @Override
    public Object interpret(Context context) {
        // 实现文法中与终结符有关的操作
        context.put("", "");
        return null;
    }
}
