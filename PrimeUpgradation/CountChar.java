import java.util.Scanner;
public class CountChar
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Enter 1 to count upper case characters, 2 to count lower case characters and 3 to count the number of vowels in your string:");
        int n = sc.nextInt();
        int count = 0;
        switch(n)
        {
            case 1:
                
                for(int i=0; i<s.length(); i++)
                {
                    if(Character.isUpperCase(s.charAt(i)))
                    count++;
                }
                break;
            case 2:
                for(int i=0; i<s.length(); i++)
                {
                    if(Character.isLowerCase(s.charAt(i)))
                    count++;
                }
                break;
            case 3:
                s = s.toLowerCase();
                for(int i=0; i<s.length(); i++)
                {
                    if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                    count++;
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println(count);
    }
}