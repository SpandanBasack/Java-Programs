import java.util.*;
class Sport
{
    String s;
    void Sport()
    {
        s = "";
    }
    void favoriteSports()
    {
        s = "Cricket";
    }
}
class Person1 extends Sport
{
    public Person1()
    {
    super();
    }
    public void personSport()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favourite sport:");
        s = sc.nextLine();
        System.out.println("Your Favourite Sport: "+s);
    }
}
public class Person2 {
    public static void main(String[] args) {
        Person1 ob = new Person1();
        ob.personSport();
    }    
}