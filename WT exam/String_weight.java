import java.util.*;
public class String_weight
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find its weight:");
        String s = sc.nextLine();
        int l = s.length();
        int sum = 0;
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            sum = sum+0;
            else
            {
                int k = (int) c;
                if((k>=65)&&(k<=90))
                {
                    int m = k-65;
                    sum = sum+m;
                }
                if((k>=97)&&(k<=122))
                {
                    int m = k-97;
                    sum = sum+m;
                }
            }
        }
        System.out.println("The Weight is: "+sum);
    }
}