package stream;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> { // 스트림 요소가 객체일 경우 객체가 comparable interface를 구현!
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Fruit o) {
        return Integer.compare(this.price,o.getPrice());
    }
    // command B로 들어가서 함수의 내부구조를 살펴 볼 수 있다.
    // compare Integer wrapper calss의 메소드이다.
    // this.price < o.getPrice  : -1
    // this.price = o.getPrice  : 0
    // this.price > o.getPrice  : 1
}
