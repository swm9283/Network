package lambdademo;
// Lambda Expression (람다식)
// 익명 메소드 (일반 메소드와 달리 이름이 없다)
// 메서드와 달리 특정 클래스에 종속되지 않지만, 매개변수,리턴타입, 본체를 가진다.
// 예외처리가 가능하다
// 메서드와 인수로 전달될 수 있고 변수에 대입될 수 있다.
// 익명 구현 객체와 달리 메서드의 핵심 부분만 포함한다.
// (타입매개변수....) -> {실행문;,실행문;....}
//한개의 추상메소드로 구성된 인터페이스 구현 객체만 람다식으로 표현가능 -> 함수형 인터페이스.
//람다식으로 모든 클래스의 객체를 구현할 수 없다.
//실행문이 하나면 중괄호와 세미클론을 생략할 수 있다.
//샐행문이 하나의 리턴 구문이면 return 키워드도 생략가능하다.


interface Positive{ // 함수형 인터페이스
    int pos(int x);
}
interface Prints{ // 함수형 인터페이스
    void print();
}
public class LambdaTest1
{
    public static void main(String[] args) {
        Positive po;
        Prints pr;

        po = (int n) ->{return n+1;};
        po = (n) -> {return n+1;}; // n이 integer일 떄 추론한다.
        po = n -> {return n+1;};  // 인수가 하나알 때 ( ) 생락가능
        po = (int n) -> n+1; // 실행문이 하나일 떄는 이렇게 줄여서 사용할 수 있다.
        po = n -> n+1;  // 이런식으로 줄여서 사용할 수 있다.

        pr = () -> {
            System.out.println("hi");
        };
//        pr= () -> System.out.println("hi");
        pr.print();

    }

}
