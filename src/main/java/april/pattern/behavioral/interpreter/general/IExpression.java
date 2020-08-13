package april.pattern.behavioral.interpreter.general;

/**
 * @author yanzx
 */
public interface IExpression {
    /**
     * 对表达式进行解释
     *
     * @param context
     * @return
     */
    Object interpret(Context context);
}
