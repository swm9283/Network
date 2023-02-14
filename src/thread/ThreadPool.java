package thread;

import java.util.concurrent.*;


public class ThreadPool {
    public static void main(String[] args) {
        // newCachedThreadPool()
        ExecutorService executorService = Executors.newCachedThreadPool();

        //newFixedThreadPool(int nThreads)
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);

        //custom
        ExecutorService executorService2 = new ThreadPoolExecutor(3, // 코어 스레드수
                100, // 최대 스레드 수
                120L, // 최대 놀 수 있는 시간 (이 시간이 넘으면 스레드 풀에서 쫓겨 남.)
                TimeUnit.SECONDS,  // 놀 수 있는 시간 단위
                new SynchronousQueue<Runnable>()); // 작업큐

        


    }
}
