package me.ely.struct.bridge;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class ConcreteRemoteControl1 extends RemoteControl {


    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl1.on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl1.off");
        tv.off();
    }

    @Override
    public void turnChannel() {
        System.out.println("ConcreteRemoteControl1.turnChannel");
        tv.turnChannel();
    }
}
