import java.util.Scanner;
import java.util.StringTokenizer;
public class PigLatin
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence which is to be converted into pig latin form:");
        String sentence = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sentence);
        String newSentence = "";
        while(st.hasMoreTokens())
        {
            String word = st.nextToken();
            String st2 = "", newWord = "";
            for(int i=0; i<word.length(); i++)
            {
                if(Character.toLowerCase(word.charAt(i))=='a'|| Character.toLowerCase(word.charAt(i))=='e' 
                || Character.toLowerCase(word.charAt(i))=='i' || Character.toLowerCase(word.charAt(i))=='o' 
                || Character.toLowerCase(word.charAt(i))=='u')
                {
                    newWord = word.substring(i)+st2+"ay";
                    newSentence = newSentence + newWord + " ";
                    break;
                }
                else if(i==word.length()-1)
                {
                    newSentence = newSentence + word + "ay ";
                    break;
                }
                else
                    st2 = st2 + word.charAt(i);
            }
        }
        System.out.println("The entered text in pig latin form");
        System.out.println(newSentence);
    }
}