package me.ely.action.strategy;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squack");
    }
}
