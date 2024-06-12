//Dynamic Method Dispatch(Runtime polymorphism)
import java.util.*;
class box
{
    int length, width, height;
    void volume(){
        int area = length*width*height;
        System.out.println("Volume: "+area);
    }
}
class Demo{
     public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    box ob = new  box();
    System.out.println("Enter the length of the box:");
    ob.length = sc.nextInt();
    System.out.println("Enter the width of the box:");
    ob.width = sc.nextInt();
    System.out.println("Enter the height of the box:");
    ob.height = sc.nextInt();
    ob.volume();
    sc.close();
    }
}