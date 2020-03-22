package me.ely.action.command;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {
    public static void main(String[] args) {
        Invoke invoke = new Invoke();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        invoke.setOnCommand(lightOnCommand, 0);
        invoke.setOffCommand(lightOffCommand, 0);

        invoke.onButtonWasPushed(0);
        invoke.offButtonWasPushed(0);
    }
}
