import java.util.Scanner;
public class decimalBinary
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert Binary to Decimal");
        System.out.println("Enter 2 to convert Decimal to Binary");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                binaryToDecimal();
                break;
            case 2:
                decimalToBinary();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    public static void binaryToDecimal()
    {
        System.out.println("Enter a number to convert to Decimal from Binary:");
        int n = sc.nextInt();
        int k=0, decimal=0, temp=n, i=0;
        while(temp!=0)
        {
            k = temp%10;
            if(k==1)
            decimal = decimal + (int)Math.pow(2, i);
            i++;
            temp = temp/10;
        }
        System.out.println("Your decimal number is: "+decimal);
    }
    public static void decimalToBinary()
    {
        System.out.println("Enter a decimal number to convert to binary:");
        int n = sc.nextInt();
        String binary="";
        while(n!=0)
        {
            String b = Integer.toString(n%2); 
            binary = b + binary;
            n = n/2;
        }                     
        System.out.println(binary);
    }
}