import java.util.Scanner;
public class FrequencyOfThe
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ending with (.):");
        String s = sc.nextLine();
        int count = 0;
        for(int i=0; i<s.length()-2; i++)
        {
            if(s.substring(i, i+3).equalsIgnoreCase("the") && (i==0 || s.charAt(i-1)==' ') && (s.charAt(i+3)==' ' || s.charAt(i+3)=='.'))
            {
                count++; 
            }
        }
        System.out.println("The number of \"the\"s in your sentence are: "+count);
    }
}