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

//        Thread a = new Thread(() ->{
//            for(int i = 0 ; i <= 5 ; ++i)
//            {
//                System.out.println(i);
//            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        } );
//        a.start();
        //Runnable 인터페이스 구현 함수형 인터페이스의 구현 객체이다.
        Thread thread = new Thread(new RunnableWorker());
//        thread.start();

        //lambda로 스레드 생성.
        Thread thread1 = new Thread(() ->{
            for(int i = 0 ; i<=5 ; ++i)
            {
                System.out.println(i);
                try{
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

//        int alphabet = 'a';
//        while (true) {
//            if (thread.getState() == Thread.State.TERMINATED) {
//                System.out.println("Thread가 종료되었습니다.");
//                break;
//            }
//            try
//            {
//                Thread.sleep(5000);
//                System.out.println((char) alphabet);
//                alphabet = alphabet + 1;
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
        int alphabet = 'a';
        while (true) {
            if (thread1.getState() == Thread.State.TERMINATED) {
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



