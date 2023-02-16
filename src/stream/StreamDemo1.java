package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("watermelon", 16000));
        fruits.add(new Fruit("watermelon", 19000));
        fruits.add(new Fruit("strawberry", 21000));
        fruits.add(new Fruit("kiwi", 12000));
        fruits.add(new Fruit("apple", 10000));
        //Stream 객체 생성
        Stream<Fruit> stream = fruits.stream();
//        Stream<Fruit> stream = fruits.parallelStream();  // 여러 스레드가 동시에 작업: 작업량이 많을 떄 병렬처리에 굉장히 유리하다.
        stream.forEach((s) -> System.out.println(s.getName() + ":" + Thread.currentThread()));

        //Fruit stream
        Stream<Fruit> fruitStream = fruits.stream();

        // price Stream
        IntStream priceStream = fruits.stream().mapToInt(fruit -> fruit.getPrice());
        //

        double average = priceStream.average().getAsDouble();
        System.out.println(average);

        //메소드 체이닝 기법
        double average2 = fruits.stream()
                .mapToInt(fruit -> fruit.getPrice())
                .average()
                .getAsDouble();
        System.out.println(average2);


    }
}
