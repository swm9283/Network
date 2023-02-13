package first;

import static java.lang.Integer.valueOf;

public class GenericClassTest1 {
    public static void main(String[] args) {
//        PostBox<String> postBox = new PostBox<String>();
        PostBox<String> postBox1 = new PostBox<>();
//        PostBox<int> postBox1 = new PostBox<int>();
        PostBox<Integer> postBox2 = new PostBox<Integer>();
//        postBox.setItem(77); string type이 아니기 때문에 요류가난다.
        postBox1.setItem("편지");
        System.out.println(postBox1.getItem());

        Integer a = new Integer(2); //과거 방식
        Integer b = Integer.valueOf(2); //현대 방식
        Integer c = Integer.valueOf("2");// 매개변수의 값을 integer 객체로 변환한다.
        Integer d = 2 ; // auto-boxing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
