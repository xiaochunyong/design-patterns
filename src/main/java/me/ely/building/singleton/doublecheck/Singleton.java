package me.ely.building.singleton.doublecheck;

/**
 * 双重校验锁
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Singleton {

    private Singleton() {}

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                // 去掉if, 会造成多次初始化, 因为有可能多个线程, 进入了第一个if.
                if (singleton == null) {
                    System.out.println("初始化了");
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
