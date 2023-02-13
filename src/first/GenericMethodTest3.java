package first;

import static first.Solidier.GenericMethodTest3.countSoldier;

class Solidier implements Comparable
{
    String name;
    String grade;

    public Solidier(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o){
        Solidier s= (Solidier)o ;
        return grade.equals(s.grade) ? 1:0 ;
    }

    public class GenericMethodTest3
    {
        public static <T extends  Comparable> int countSoldier(T[] arr,T a)
        {
            int count = 0;
            for(T ar : arr)
            {
                if(ar.compareTo(a) == 1)
                    count ++;
            }
            return count;
        }
    }
}
public class GenericMethodTest3 {
    public static void main(String[] args) {
        Solidier[] s = {new Solidier("박민석","이병"),new Solidier("성윤모","이병"),
        new Solidier("차병호","이병"),new Solidier("김상훈","상병"),new Solidier("최일구","병장")};

        System.out.println("분대에 이병 인원은" + countSoldier(s,new Solidier("김아무개","이병")) + "명입니다.");
    }

}
