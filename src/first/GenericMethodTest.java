package first;

public class GenericMethodTest {
    static class Prints{
        //generic method.
        public static <T> void printArray(T[] arr)
        {
            for(T a : arr)
            {
                System.out.println(a);
            }
        }

        //Overoading
        // 코드 중복이 많고 하드 코딩이다. 굉징히 비효율적 이러한 것을 간단하게 하는 것이 제네릭 메소드이다.
        public static void pringArray(Integer[] arr)
        {
            for(Integer a : arr)
            {
                System.out.println(a);
            }
        }
        public static void pringArray(Double[] arr)
        {
            for(Double a : arr)
            {
                System.out.println(a);
            }
        }
        public static void pringArray(String[] arr)
        {
            for(String a : arr)
            {
                System.out.println(a);
            }
        }



    }

    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.71, 9.9} ;
        Integer[] i1 = {10,9,7};
        String[] s1 = {"hi","hello"};
        Prints.printArray(d1);
//        Prints.<Double>printArray(d1);
        Prints.printArray(i1);
        Prints.printArray(s1);
    }
}
