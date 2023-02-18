package lecturematerial;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;

public class MulticastServer{

    public static void main(String[] args) {
        System.out.println("NiO타임 서버 시작 중!");
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(5000));
            while (true) {
                System.out.println("클라이언트 기다리는 중");
                SocketChannel socketChannel
                        = serverSocketChannel.accept();

                if (socketChannel != null) {
                    String dateAndTimeMessage = "Date: " +
                            new Date(System.currentTimeMillis());

                    ByteBuffer buf = ByteBuffer.allocate(64);
                    // If buffer is not large enough: BufferOverflowException
                    buf.put(dateAndTimeMessage.getBytes());
                    buf.flip();
                    while (buf.hasRemaining()) {
                        socketChannel.write(buf);
                    }
                    System.out.println("Sent: " + dateAndTimeMessage);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
