package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
//
//String class에 속한 trim메소드
//
//        문자열.trim()
//
//        * 문자열의 앞 뒤 공백을 지운다.
//        * 양 끝의 \n  \t 또한 지운다.
//        * 단, 문자열 사이의 공백은 지우지 못하며 문자열 가운데 공백을 지우고 싶을 때는 replaceAll method를 사용해야한다.




public class StreamDemo2 {
    public static void main(String[] args) {
        String raw = "10, 20 , 30, 40, 50  ,  60    ";
        ArrayList<String> rawProcess1 = new ArrayList<>(Arrays.asList(raw));
//        System.out.println(rawProcess1);
        rawProcess1.stream()
                .flatMapToInt((data) ->
                {
                    String[] dataProcess1 = data.split(",");
                    int[] dataProcess2 = new int[dataProcess1.length];
                    for(int i = 0 ; i < dataProcess1.length ; ++i)
                    {
                        dataProcess2[i] = Integer.parseInt(dataProcess1[i].trim()); // .trim() 문자열에서 불필요한 값 정리
                    }
                    return Arrays.stream(dataProcess2);


                }).forEach(System.out::println);
    }
}