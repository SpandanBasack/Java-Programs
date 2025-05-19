import java.util.*;
public class printDuplicate
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find the duplicate characters in it:");
        String s = sc.nextLine();
        LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();
        for(int i = 0; i<s.length(); i++)
        {
            if(h.containsKey(s.charAt(i)))
                h.put(s.charAt(i), h.get(s.charAt(i))+1);
            else
                h.put(s.charAt(i), 1);
        }
        int value = 0;
        for(Map.Entry<Character, Integer> entry :h.entrySet())
        {
            value = entry.getValue();
            if(value>1)
            {
                System.out.println(entry.getKey()+" count:"+value);
            }
        }
    }
}