package me.ely.action.interpreter.calc;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {

    public static void main(String[] args) {
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Context context = new Context();
        context.assign(a, false);
        context.assign(b, true);
        System.out.println("a=" + a.interpret(context));
        System.out.println("b=" + b.interpret(context));

        Constant c = new Constant(true);
        Expression exp = new Or(new And(c, a), new And(b, new Not(a)));
        System.out.println(exp.toString() + "=" + exp.interpret(context));

    }

}
