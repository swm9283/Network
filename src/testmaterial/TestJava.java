package testmaterial;

// 생성자가 private인 경우
class One{
    private One()
    {

    }
    public static One produceOneInstance()
    {
        return new One();
    }

}

public class TestJava
{
    public static void main(String[] args) {
        One o = One.produceOneInstance();
    }
}