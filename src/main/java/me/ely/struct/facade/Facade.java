package me.ely.struct.facade;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTv();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
