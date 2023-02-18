package lecturematerial.javabasemodule.stringclass;
// 자바에서 문자열과 관련된 주요 클래스
// 클래스                             | 설명
// String                            : 문자열을 저장하고 조작할 때 사용.
// StringBuffer                      : 효율적인 문자열 조작 기능이 필요할 때 사용.
// StringTokenizer                   : 구분자로 연결된 문자열을 분리할 때 사용.

import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class StringClass {
    public static void main(String[] args) {
        String data = "abc";
        System.out.println(data+ " : " + data.hashCode());
        data = data + "bce";
        System.out.println(data+ " : " + data.hashCode());
        //String의 경우 문자열을 수정할 수 없다. + 연산자로 문자열을 더할 경우 새로운 객체를 생성한다.
        // ----> 메모리 손실 발생!

        StringBuilder data1 = new StringBuilder("abc");
        System.out.println(data1+ " : " + data1.hashCode());
        data1.append("bce");
        System.out.println(data1+ " : " + data1.hashCode());
        //stringBuilder의 경우 이전의 객체를 버리지 않고 문자열 객체를 수정할 수 있다.
        data1.delete(0,1);
        data1.insert(3,"장서진");
        data1.replace(0,1,"보고싶다");
        data1.toString();
        System.out.println(data1);

        //StringTokenizer 클래스.

//        String data2 = "송우민/장서진/우민,서진,우&서";
        String data2 = "송우민/장서진/김주원/최재원";
        String[] names = data2.split("/");


//        System.out.println(names[0].getClass());
        Arrays.stream(names)
                .filter(token1  ->
                {
//                    if (Objects.equals(token1, "송우민") || Objects.equals(token1, "장서진"))
//                    if(token1.equals("송우민") || token1.equals("장서진"))
                    if(token1 == "송우민" || Objects.equals(token1, "장서진"))  // 송우민이랑 token1이랑 다른 참조값을 가리키는 다른 객체이다.
                    {
                        return true;
                    }
                    else {
                        return false;
                    }
////                    return token1.contains("장");

                })
                .forEach(System.out::println);
        String A = "1";
        System.out.println(A.equals("1"));
        Object a = "a";
        String rawData = "송우민/장서진/최재원/김주원";
        StringTokenizer data4 = new StringTokenizer(rawData,"/");
        System.out.println(data4.countTokens());  //분리할 수 있는 문자열의 총 수
        while(data4.hasMoreTokens())  // 남아 있는 문자열이 있는 지 여부
        {
            String token = data4.nextToken(); // 문자열을 하나씩 가져옴
            System.out.println(token);
        }


    }
}
