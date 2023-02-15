//StringBuilder Vs String
//string append 승리

public class TestJava {
    public static void main(String[] args) {
        String s = new String("hi");
        long start = System.nanoTime();
        for(int i = 0 ; i<=100000 ; ++i)
            s = s + "!";
        long end = System.nanoTime();
        System.out.println(end - start);

        StringBuilder sb = new StringBuilder("hi");
        long start1 = System.nanoTime();
        for(int i = 0 ; i<=100000 ; ++i)
            sb = sb.append("!");
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);

    }
}