
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class link{

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printList(head);
    }



    public static void printList(Node result)
    {
        while (result != null)
        {
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println();
    }
}