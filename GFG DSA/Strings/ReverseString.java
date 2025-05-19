import java.util.*;
public class ReverseString
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse it:");
        String s = sc.nextLine();
        String s2 = "";
        for(int i = s.length()-1; i>=0; i--)
            s2 = s2 + s.charAt(i);
        System.out.println(s2);
    }
}