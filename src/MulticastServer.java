import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;


public class MulticastServer {
    public static void main(String[] args) {
        System.out.println("Multicast  Time Server");
                DatagramSocket serverSocket = null; // UDP
        try {
            serverSocket = new DatagramSocket();
            while (true) {
                String dateText = new Date().toString();
                byte[] buffer = new byte[256];
                buffer = dateText.getBytes();
                InetAddress group =
                        InetAddress.getByName("224.0.0.7"); // multicast address는 주어진 범위에서만 맞춰주면 된다.
                DatagramPacket packet;
                packet = new DatagramPacket(buffer, buffer.length, group, 10000);
                serverSocket.send(packet);
                System.out.println("전송된 시간: " +
                        dateText);
                try {
                    Thread.sleep(5000); // 1초 단위 딜레이
                } catch (InterruptedException ex) {
                    // Handle exception
                }
            }
        }
        catch (SocketException ex) {
        // Handle exception
        } catch (IOException ex) {
        // Handle exception
        }

    }
}
