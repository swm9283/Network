package first;

import java.util.Arrays;

class Circle implements Comparable<Circle>{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public String toString()
    {
        return String.format("원의 반지름은 %s입니다.",radius);
    }

//    @Override
//    public int compareTo(Object o) {
//        Circle c = (Circle)o;
//        return (int)(getArea() - c.getArea()); // 크면 양수 작으면 음수 같으면 0

    @Override
    public int compareTo(Circle c) {
//        Circle c = (Circle)o;
        return (int)(getArea() - c.getArea()); // 크면 양수 작으면 음수 같으면 0

        }
}

public class CircleDemoTest1
{
    public static void main(String[] args) {
        Circle[] circles = {new Circle(5.0),new Circle(2.5),new Circle(10.0)};


        Arrays.sort(circles);

        for(Circle c : circles)
        {
            System.out.println(c);
        }
    }

}
