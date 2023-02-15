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