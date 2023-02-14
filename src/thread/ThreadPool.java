package thread;

import com.sun.jdi.ThreadReference;

import java.util.concurrent.*;


public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {

        //newFixedThreadPool(int nThreads)
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // 작업 처리 요청이란 ExecutorService의 작업 큐애 Runnable 또는 Collable 객체를 넣는 행위를 말한다.
        //submit(Runnable task) submit(Runnable task,V result) submit(Collable task)
        //Future 객체 리턴
        //Runnable 또는 Collable 을 작업 큐에 저장
        // return 된 Future를 통해 작업 처리 결과를 알 수 있음
        // 예외가 발생하더라도 스레드는 종료되지 않고 다른 작업에 재사용될 수 있음.
        // 가급적 이 메소드를 사용하는 것을 추천

        for(int i = 0 ; i <10 ; ++i)
        {
            Runnable runnable = () ->
            {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                int poolSize = threadPoolExecutor.getPoolSize();
                String threadName = Thread.currentThread().getName();
                System.out.printf("[총 스레드 개수 : %d 작업 스레드 이름 : %s]\n",poolSize,threadName);
                int value = Integer.parseInt("삼");
            };
            executorService.submit(runnable);
            Thread.sleep(100);

        }
        executorService.shutdown();
        // 예외가 발생하더라도 기존 스레드를 재활용하여 작업을 처리하는 것을 알 수 있다.
    }
}
