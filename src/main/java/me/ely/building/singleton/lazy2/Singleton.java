package me.ely.building.singleton.lazy2;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Singleton {

    private Singleton() {}

    private static Singleton singleton;

    // 线程安全, 当一个线程进入后, 其它试图进入该线程的方法都必须等待, 即使已经实例化了
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            System.out.println("初始化了");
            singleton = new Singleton();
        }
        return singleton;
    }
}
