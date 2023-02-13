package first;

public class GenericMethodTest2 {
    static class Prints{
        //generic method.
        public static <T extends Number> void printArray(T[] arr) // type 제한.
        {
            for(T a : arr)
            {
                System.out.println(a);
            }
        }
        public static <T> T getFirst(T[] arr)  // return type도 type parameter가 올 수 있다.
        {
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.71, 9.9} ;
        Integer[] i1 = {10,9,7};
        String[] s1 = {"hi","hello"};
        Character[] c1 = {'A', 'B','C'};
        System.out.println(Prints.getFirst(c1));
        Prints.printArray(d1);
//        Prints.<Double>printArray(d1);
        Prints.printArray(i1);

        // number class의 자식 class로 제한해서 문자, 문자열 배려을 사용 불가!
//        Prints.printArray(s1);
//
//        Prints.printArray(c1);
    }


}
