import java.util.Scanner;
import java.util.StringTokenizer;
public class WordFrequency
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to find the frequency of a specific word in it:");      
        String s = sc.nextLine();
        System.out.println("Enter the word:");
        String word = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        int count = 0;
        while(st.hasMoreTokens())
        {
            String s1 = st.nextToken();
            if(s1.charAt(s1.length()-1)=='.')
                s1 = s1.substring(0, s1.length()-1);
            if(s1.equals(word))
            count++;
        }
        System.out.println("The frequency of the entered word is: "+count);
    }   
}