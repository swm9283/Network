package first;

import java.util.ArrayList;

import static java.lang.Integer.valueOf;

public class GenericClassTest1 {
    public static void main(String[] args) {
//        PostBox<String> postBox = new PostBox<String>();
        PostBox<String> postBox1 = new PostBox<>();
//        PostBox<int> postBox1 = new PostBox<int>();
        PostBox<Integer> postBox2 = new PostBox<Integer>();
//        postBox1.setItem(77); string type이 아니기 때문에 요류가난다.
        postBox1.setItem("편지");
        System.out.println(postBox1.getItem());
        postBox2.setItem(123);
        System.out.println(postBox2.getItem());



    }
}
