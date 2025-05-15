import java.util.Scanner;
public class MagicNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Magic Number:");
        int n = sc.nextInt();
        int temp = n, sum=0,k=0;
        boolean magic=false ;
        while(temp!=0)
        {
            k = temp%10;
            sum = sum+k;
            temp = temp/10;
            if(temp == 0 && sum>9)
            {
                temp = sum;
                sum=0;
            }
            else if(temp == 0 && sum==1)
            magic = true;  
        }
        if(magic == true)
            System.out.println("Your entered number is a magic number.");
        else
            System.out.println("Your entered number is not a magic number.");
    }
}
