import java.util.*;
interface Student
{
    void name();
    void roll();
}
public class KIIT implements Student
{
    public void name()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
    }
    public void roll()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no.:");
        int roll = sc.nextInt();
    }
    public static void main(String[]args)
    {
        KIIT ob = new KIIT();
        ob.name();
        ob.roll();
    }
}