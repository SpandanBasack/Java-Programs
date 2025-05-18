import java.util.*;

public class ReverseLinkedListStack
{
    static Node reverseList(Node head)
    {
        LinkedList<Node> stack = new LinkedList<Node>();
        Node curr = head;
        while(curr.next.next!=null)
        {
            stack.add(curr);
            curr = curr.next;
        }
        stack.add(curr);
        curr = curr.next;
        head = curr;
        while(!stack.isEmpty())
        {
            curr.next = stack.pollLast();
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
      	
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked List:");
        printList(head);

        head = reverseList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }
}
class Node
{
    Node head;
    int data;
    Node next;
    Node(int n)
    {
        data = n;
    }
}