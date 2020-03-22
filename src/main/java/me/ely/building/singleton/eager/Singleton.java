package me.ely.building.singleton.eager;

/**
 * 饿汉式单例
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Singleton {

    private Singleton() {}

    // 饿汉式单例, 线程安全, 但是可能会造成资源浪费
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return  singleton;
    }

}
