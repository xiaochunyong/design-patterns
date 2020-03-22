package me.ely.struct.facade;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class SubSystem {
    public void turnOnTv() {
        System.out.println("turnOnTv()");
    }

    public void setCD(String cd) {
        System.out.println("setCD(" + cd + ")");
    }

    public void startWatching() {
        System.out.println("startWatching()");
    }
}
