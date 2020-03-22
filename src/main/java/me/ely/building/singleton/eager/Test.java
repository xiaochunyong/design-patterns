package me.ely.building.singleton.eager;

import me.ely.building.singleton.staticclass.Singleton;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 饿汉式单例, 线程安全, 但是可能会造成资源浪费
        long startTime = System.currentTimeMillis();
        int threadNumber = 10000;
        final Set<Singleton> instanceSet = new CopyOnWriteArraySet<Singleton>();
        final CountDownLatch countDownLatch = new CountDownLatch(threadNumber);
        for (int i = 0; i < threadNumber; i++) {
            new Thread(new Runnable() {
                public void run() {
                    countDownLatch.countDown();
                    instanceSet.add(Singleton.getInstance());
                }
            }).start();
        }
        countDownLatch.await();
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("耗时:" + elapsedTime + ", 实例数: " + instanceSet.size());
    }
}
