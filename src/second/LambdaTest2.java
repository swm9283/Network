package second;
//Lambda Expression
// x -> Integer.parseInt(x);

//method reference
//Integer::parseInt

//정적 메소드 참조
// 클래스이름 :: 정적메소드

//인스턴스 메소드 참조
// 객체이름::인스턴스 메소드

//생성자 참조
//클래스 이름::new
//배열타임 이름::new

interface Calc{
    double calculate(double d);
}
interface Gets{
    char get(String s, int i);
}

public class LambdaTest2 {
    public static void main(String[] args) {
    Calc c;
    Gets g;
    //lambda exrpession
//    c = (d) -> {return Math.abs(d);};
//    System.out.println((c.calculate(-9.9)));
//    // static method reference
//    c = Math ::abs;
//    System.out.println(c.calculate(-9.9));\
    //lambda
//    g = (a,b) -> a.charAt(b);
    //instanc method reference
    g = String::charAt;
    System.out.println(g.get("Hello My friend!!",4));
    System.out.println("Hello My freind!".charAt(4));


    }
}
