package thread;
import java.util.concurrent.*;


class Worker extends Thread
{
    public void run()
    {
        //for 문을 사용해 1초마다 0부터 하나씩 증가해서 5초동안 출력
        for(int i = 0 ; i <= 5 ; ++i)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(5000);
            }catch(InterruptedException ignored)
            {

            }
        }
    }

}


public class threadMission {
    public static void main(String[] args) {

        Runnable task = () ->
        {
            for(int i =0; i < 5; ++i)
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(task);

        for(int i = 'a' ; i <='z' ; ++i)
        {
            System.out.println((char)i);
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        exec.shutdown();
    }
}



