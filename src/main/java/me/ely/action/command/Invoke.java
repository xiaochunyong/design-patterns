package me.ely.action.command;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Invoke {
    private Command[] onCommands;
    private Command[] offCommands;
    private final int slotNum = 7;

    public Invoke() {
        this.onCommands = new Command[slotNum];
        this.offCommands = new Command[slotNum];
    }

    public void setOnCommand(Command command, int slot) {
        this.onCommands[slot] = command;
    }

    public void setOffCommand(Command command, int slot) {
        this.offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }
}
