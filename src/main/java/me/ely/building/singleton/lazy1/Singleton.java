package me.ely.building.singleton.lazy1;

/**
 * 懒汉式 - 线程不安全
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Singleton {

    private Singleton() {}

    public static Singleton singleton;

    // 线程不安全, 多线程环境下, 会初始化多个实例
    public static Singleton getInstance() {
        if (singleton == null) {
            System.out.println("初始化了");
            singleton = new Singleton();
        }
        return singleton;
    }

}
