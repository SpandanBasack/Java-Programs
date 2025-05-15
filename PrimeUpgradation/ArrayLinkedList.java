import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class ArrayLinkedList
{
    public static void main(String[]args)
    {
        List list = new ArrayList();
        list.add("Kolkata");
        list.add("Bengaluru");
        list.add("Delhi");
        System.out.println(list);
        List<String> list2 = new LinkedList();
        list2.addFirst("su-57");
        list2.addFirst("F-35");
        list2.addFirst("F-22");
        System.out.println(list2);
    }
}