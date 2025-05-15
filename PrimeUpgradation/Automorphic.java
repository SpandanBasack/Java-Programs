import java.util.Scanner;
public class Automorphic
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to be displayed:");
        int n = sc.nextInt();
        int i = 0, k=1;
        while(i<n)
        {
            int sq = k*k;
            int temp1 = sq;
            int temp2 = k;
            while(temp1!=0 || temp2!=0)
            {
                int b = temp1%10;
                int d = temp2%10;
                if(b==d)
                {
                    temp1 = temp1/10;
                    temp2 = temp2/10;    
                }
                else
                    break;
            }
            if(temp2==0)
            {
                System.out.println(k);
                i++;
            }
            k++;
        }
    }
}