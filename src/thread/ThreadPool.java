package thread;

import com.sun.jdi.ThreadReference;

import java.util.concurrent.*;


public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {

        //newFixedThreadPool(int nThreads)
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // execute() 메소드로 작업 처리 요청한 경우
        // execute(Runnable command)
        // void 리턴 타입
        // Runnable 을 직업 큐에 저장하고 , 작업 처리 결과를 받지 못함.
        // 예외가 발생하면 해당 스레드를 스레드 풀에서 제거함.
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
            executorService.execute(runnable);
            Thread.sleep(100);

        }
        executorService.shutdown();
        // 결과를 보면 스레드 풀의 스레드 최대 개수는 2개로 변함이 없지만, 실행 스레드의 이름을 보면 모두 다른 스레드가 작업을 처리하고 있다.
        // 이는 작업 처리 중에 요류가 발생하면 해당 스레드는 스레드 풀에서 제거하고 , 새 스레드를 생성해서 넣기 때문이다.
    }
}
