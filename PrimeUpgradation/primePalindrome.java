import java.util.*;
public class primePalindrome
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();
        System.out.println("The prime palindrome numbers between "+n+" and "+m+" are:");
        for(int i=n; i<=m; i++)
        {
            int temp = i;
            int reverse = 0;
            while(temp!=0)
            {
                int k = temp%10;
                reverse = (reverse*10) + k;
                temp = temp/10;
            }
            if(i==reverse)
            {   
                int count=0;
                for(int j = 1; j<=reverse; j++)
                {
                    if(reverse%j==0)
                        count++;
                }
                if(count <= 2)
                System.out.println(reverse);
            }
        }
    }
}