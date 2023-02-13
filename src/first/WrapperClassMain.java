package first;

import java.util.ArrayList;

public class WrapperClassMain {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        Integer c = new Integer(3);
        Integer d = new Integer(3);
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        //a와b는 같은 주소지를 참조하지만 c와 d는 Integer class의 서로 다른 객체이므로 주소지가 다르다.

        // Auto-boxing의 예.
        ArrayList<Integer> IntArray = new ArrayList<>();
        IntArray.add(1);
        IntArray.add(1);
        IntArray.add(1);

        // Wrapper 클래스 객체 생성방법.
        Integer i1 = new Integer(10);  // 방법1 옛날 방식.
        Integer i2  = Integer.valueOf(11); // 방법2. 매개변수의 값(정수)를 Integer객체로 반환합니다.
        Integer i3 = Integer.valueOf("12"); // 방법3. 문자열로 표시된 정수를 Integer객체로 반환합니다.
        Integer i4 = 10 ; //방법 4 auto boxing으로 직접 기본형 데이터를 대입합니다.

        // auto Boxing and auto UnBoxing
        Integer i5 = 10 ; // auto Boxing
        int i6 = i5 ; //auto UnBoxing


        //문자를 숫자로 변강하기
        //  parseInt    valueOf
        System.out.println("문자열을 --> int형으로 :" + Integer.parseInt("10"));
        System.out.println("문자열을 --> int형으로 :" + Integer.parseInt("F",16)); // 16진수
        System.out.println("문자열을 --> Integer형으로 :" + Integer.valueOf("10"));
        System.out.println("문자열을 --> Intger형으로 :" + Integer.valueOf("F",16));
        //숫자를 문자로 변경하기
        //toString  toBinaryString  toOctalString toHexString
        System.out.println("10을 --> 문자열로 :" + Integer.toString(10));
        System.out.println("10을 --> 2진수 문자열로 :" + Integer.toBinaryString(10));
        System.out.println("10을 --> 8진수 문자열로:" + Integer.toOctalString(10));
        System.out.println("10을 --> 16진수 문자열로 :" + Integer.toHexString(10));

        System.out.println("10을 --> 16진수 문자열로 :" + Integer.toString(10,16));
        System.out.println("10을 --> 2진수 문자열로:" + Integer.toString(10,2));
        System.out.println("10을 --> 8진수 문자열로:" + Integer.toString(10,8));


    }
}
