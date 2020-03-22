package me.ely.action.interpreter.calc;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Not extends Expression {

    private Expression expression;

    public Not(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(Context context) {
        return !expression.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + "Not " + expression.toString() + ")";
    }
}
