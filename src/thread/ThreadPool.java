package thread;

import com.sun.jdi.ThreadReference;

import java.util.concurrent.*;


public class ThreadPool
{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());
//
//        System.out.println("작업 처리 요청");
//        Runnable runnable = () -> {
//            int total = 0;
//            for(int i = 0 ; i <= 10 ; ++i)
//            {
//                total = total + i;
//            }
//            System.out.printf("[처리 결과] : %d\n",total);
//        };
//        Future<?> future = executorService.submit(runnable);
//
//        try{
//            future.get();
//            System.out.println("작업 처리 완료");
//        } catch (ExecutionException e) {
//            System.out.printf("실행 예외 발생함 : %s",e.getMessage());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        executorService.shutdown();

        System.out.println("작업 처리 요청");
        Callable<Integer> task = ()->{
            int total = 0;
            for(int k = 0 ; k <= 10 ; ++k)
            {
                total = total + k;
            }
            return total;
        };
        Future<Integer> future = executorService.submit(task);

        try{
            int total = future.get();
            System.out.printf("{처리 결과} : %d\n",total);
            System.out.println("작업 처리 완료");
        } catch (ExecutionException e) {
            System.out.println("실행 예외 발생함." + e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
