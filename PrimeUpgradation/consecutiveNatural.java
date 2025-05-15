import java.util.*;
public class consecutiveNatural
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<n; i++)
        {
            sum=0;
            int arr[] = new int[n];
            int k = 0;
            for(int j=i; j<n; j++)
            {
                sum = sum+j;
                arr[k] = j;
                k++;
                if(sum==n)
                {
                    for(int m = 0; m<arr.length; m++)
                    {
                        if(arr[m]==0)
                        break;                        
                        System.out.print(arr[m]+" "); 
                    }
                    System.out.println();
                    break;
                }
                else if(sum>n)
                break;
                else
                continue;
            }
        }
    }
}