package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StreamDemo3 {
    public static void main(String[] args) {

        Fruit[] fruitsArray = {new Fruit("waterMelon",190000)
                ,new Fruit("waterMelon",21000)
                ,new Fruit("strawberry",18000)
                ,new Fruit("kiwi",12000)
                ,new Fruit("banana",3800)
                ,new Fruit("Apple", 12800)};


        ArrayList<Fruit> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));
//
//        fruitsList.stream()
////                .mapToInt(data -> data.getPrice()) 이렇게 하면 fruitList original stream을 int요소 바꾸기 때문에 overriding해
//                // 놓은 비교 연산자에 문제가 생긴다.
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
        fruitsList.stream()
                .sorted((o1,o2) -> o2.getPrice() - o1.getPrice())
                .forEach((data) -> {
                    System.out.println(data.getName() +":"+ data.getPrice() );
                });


    }
}
