package thread;

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

class RunnableWorker implements Runnable
{
    @Override
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

        Worker worker = new Worker();
        worker.start();

        int alphabet = 'a';
        while (true) {
            if (worker.getState() == Thread.State.TERMINATED) {
                System.out.println("Thread가 종료되었습니다.");
                break;
            }
            try
            {
                Thread.sleep(5000);
                System.out.println((char) alphabet);
                alphabet = alphabet + 1;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}



