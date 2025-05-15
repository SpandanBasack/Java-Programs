//Find the frequency of "the" using Scanner class
import java.util.Scanner;
public class FrequencyOfTheScanner
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to find the number of \"the\"s in it. The sentence should end with a (.).:");
        String s = "";
        int count = 0;
        while(true)
        {
            s = sc.next();
            if(s.equals("The") || s.equals("the"))
            {
                count++;
            }
            if(s.equals("."))
            break;
        }
        System.out.println(count);
    }
}