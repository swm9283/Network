import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class day21
{
    public static void main(String[] args) {
        try {
            InetAddress addr = Inet4Address.getByName("www.inha.ac.kr");  // 어떻게 new가 없이 객체 생성? 내부적으로 객체를 생성하고 있을 수 있다.
//            InetAddress addr = Inet4Address.getByName("www.kiminha.ac.kr");
            System.out.println(addr);
            System.out.println(addr.getCanonicalHostName());
            System.out.println(addr.getHostAddress());
            System.out.println(addr.getHostName());
        } catch (UnknownHostException e) {
//            throw new RuntimeException(e);
            System.out.println("해당 URL은 존재 하지 않습니다.");
        }
    }
}
