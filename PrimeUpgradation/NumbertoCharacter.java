import java.util.*;
public class NumbertoCharacter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4; i++)
        {
            System.out.println("Enter the number:");
            arr[i] = sc.nextInt();
        }
        char c;
        System.out.println("The characters are:");
        for(int i=0; i< 4; i++)
        {
            c = (char) arr[i];
            System.out.println(arr[i]+"-"+c);
        }
    }
}