package me.ely.building.singleton.lazy2;

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
        // 懒汉式2 在多线程环境下安全, 但是会造成拥堵
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
