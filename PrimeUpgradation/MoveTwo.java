import java.util.Scanner;
public class MoveTwo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode:");
        String s = sc.nextLine();
        String s1="";
        for(int i=0; i<s.length(); i++)
        {
            int c = (int) s.charAt(i);
            if(c>=65 && c<=90)
            {
               if(c+2>90)
               c=65+(c+2-90-1);
               else
               c=c+2; 
            }
            else if(c>=97 && c<=122)
            {
                if(c+2>122)
                c=97+(c+2-122-1);
                   else
                c=c+2;
            }
            s1 = s1+(char)c;
        }
        System.out.println("The updates string:");
        System.out.println(s1);
    }
}