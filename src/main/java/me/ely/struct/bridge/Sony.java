package me.ely.struct.bridge;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Sony extends TV {
    @Override
    public void on() {
        System.out.println("Sony.on");
    }

    @Override
    public void off() {
        System.out.println("Sony.off");
    }

    @Override
    public void turnChannel() {
        System.out.println("Sony.turnChannel");
    }
}
