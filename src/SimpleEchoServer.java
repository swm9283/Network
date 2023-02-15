import packt.ThreadedEchoServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SimpleEchoServer implements Runnable {

    private static Socket clientSocket;

    public SimpleEchoServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(2); // 2threads
        System.out.println("다중 접속 에코 서버");
        try (ServerSocket serverSocket = new ServerSocket(9900)) {
            while (true) {
                System.out.println("연결 대기 중.");

                clientSocket = serverSocket.accept();
                ThreadedEchoServer tes = new ThreadedEchoServer(clientSocket);
//                new Thread(tes).start();// thraed 무한 발금
                eService.submit(tes);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Threaded Echo Server Terminating");
    }

    @Override
    public void run() {
        System.out.println("Connected to client using [" + Thread.currentThread() + "]");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter pr = new PrintWriter(
                     clientSocket.getOutputStream(), true)) {
            // Traditional implementation
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println("Client request [" + Thread.currentThread() + "]: " + inputLine);
                pr.println(inputLine);
            }
            System.out.println("Client [" + Thread.currentThread() + " connection terminated");
            // Functional implementation
//                Supplier<String> socketInput = () -> {
//                    try {
//                        return br.readLine();
//                    } catch (IOException ex) {
//                        return null;
//                    }
//                };
//                Stream<String> stream = Stream.generate(socketInput);
//                stream
//                        .map(s -> {
//                            System.out.println("Client request: " + s);
//                            out.println(s);
//                            return s;
//                        })
//                        .allMatch(s -> s != null);
        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.println("다중 접속 예외 발생!");
        }
    }
}
