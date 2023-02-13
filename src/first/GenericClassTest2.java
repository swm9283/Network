package first;
class Dp<K,V>
{
    private K name;
    private V grade;

    //매개변수 생성자
    public Dp(K name, V grade) {
        this.name = name;
        this.grade = grade;
    }


    public K getName() { // getter name
        return name;
    }

    public V getGrade() {  // getter grade
        return grade;
    }
}
public class GenericClassTest2 {
    public static void main(String[] args) {
        Dp<String,String> s1 = new Dp<>("한호열", "상병");
        Dp<String,Integer> s2 = new Dp<>("한호열", 3);
        Dp<String,String> s3 = new Dp<>("임지섭", "대위");
        Dp<Soldier,String> s4 = new Dp<>(new Soldier(),"대위"); // 인수로 다른 클래스의 객체를 받을 수 있다.
        System.out.println(s1.getName() + "의 계급은 " + s1.getGrade());
        System.out.println(s2.getName() + "의 계급은 " + s2.getGrade());
        System.out.println(s3.getName() + "의 계급은 " + s3.getGrade());
    }
}
