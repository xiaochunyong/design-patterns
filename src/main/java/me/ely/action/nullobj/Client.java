package me.ely.action.nullobj;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {
    public static void main(String[] args) {
        AbstractOperation operation = m(-1);
        operation.request();
    }

    public static AbstractOperation m(int n) {
        if (n < 0) {
            return new NullOperation();
        }
        return new RealOperation();
    }
}
