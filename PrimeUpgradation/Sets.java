import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
public class Sets
{
    public static void main(String[]args)
    {
        HashSet<String> set = new HashSet();
        set.add("Hyderabad");
        set.add("Banglore");
        set.add("Gurgaon");
        set.add("Amravati");
        set.add("Hyderabad");
        LinkedHashSet<String> ls = new LinkedHashSet();
        ls.add("Delhi");
        ls.add("Jaipur");
        ls.add("Kolkata");
        Set sortedSet = new TreeSet();
        sortedSet.add("F-22");
        sortedSet.add("F-35");
        sortedSet.add("F-15");
        sortedSet.add("F-16");
        sortedSet.add("F-14");
        System.out.println(set);
        System.out.println(ls);
        System.out.println(sortedSet);
    }
}