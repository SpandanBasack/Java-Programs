import java.util.*;
abstract class shape {
    int side;
    abstract public void area();    
}
class square extends shape{
    square()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square:");
        side = sc.nextInt();
    }
    public void area()
    {
        int area = side*side;
        System.out.println(area);       
    }
}
class Circle extends shape{
    Circle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Circle:");
        side = sc.nextInt();
    }
    public void area()
    {
        float area = (float) 3.14*side*side;    
        System.out.println(area);    
    }
}
class Calc
{
    public static void main(String[]args)
    {
        square ob = new square();
        ob.area();
        Circle ob1 = new Circle();
        ob1.area();
    }
}