package me.ely.struct.bridge;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class ConcreteRemoteControl2 extends RemoteControl {


    public ConcreteRemoteControl2(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl2.on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl2.off");
        tv.off();
    }

    @Override
    public void turnChannel() {
        System.out.println("ConcreteRemoteControl2.turnChannel");
        tv.turnChannel();
    }
}
