
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}
public class addTwoLinked{
    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(8);
        printList(head1);
        Node head2 = new Node(5);
        head2.next = new Node(8);
        head2.next.next = new Node(3);
        // head2.next.next.next = new Node(2);
        // head2.next.next.next.next = new Node(8);
        printList(head2);

        

        add(head1,head2);
    }

    private static void add(Node head1, Node head2) {
        // printList(head2);
        add(head1, head2); 
        // printList(head2);

    }

    private static void addZero(Node head1,Node head2) {
        Node curr1=head1;
        Node curr2=head2;
        while(curr1!=null||curr2!=null){
            System.out.println("hi");
            if(curr1==null){
                Node temp  = new Node(0);
                temp.next = head1;
                head1 = temp;
                curr2 = curr2.next;
            }else if(curr2==null){
                Node temp  = new Node(0);
                temp.next = head2;
                head2 = temp;
                curr1=curr1.next;
            }else{
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
        }
        printList(head2);
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    
}