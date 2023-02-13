package first;
import java.util.Arrays;
import java.util.Comparator;

public class StringDemoTest {
    public static void main(String[] args) {
        String[] strings = {"Hi","Hello friend","Hello friend professor"};

//    Arrays.sort(strings); // 사전순

        // 문자열 길이 순
//        Arrays.sort(strings,new Comparator<String>(){
//            @Override
//            public int compare(String o1,String o2)
//            {
//                return o1.length() - o2.length();
//            }
//        });
        // 람다식을 이용한 문자열 길이 순
        Arrays.sort(strings,(o1,o2)->o2.length()-o1.length());

        for(String s : strings)
        {
            System.out.println(s);
        }

    }

}
