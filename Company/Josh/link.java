
class Node{
    int data;
    Node next;
    // Node prev;
    Node(int data){
        this.data=data;
    }
}
public class link{

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        // printList(head);
        solve(head);
    }



    private static Node solve(Node head) {
        if(head == null){
            return null;
        }
        Node curr = head;
        Node mid = findMid(head);
        Node halReverse = reverse(mid.next);
        mid.next=null;
        printList(head);
        printList(halReverse);
        // while(curr!=null){
        //     System.out.print(halReverse.data+" "+curr.data+" ");
        //     curr = curr.next;
        //     halReverse = halReverse.next;
        // }
        Node res = solution(curr,halReverse);
        printList(res);
        return null;
    }



   private static Node solution(Node curr1, Node curr2) {
        Node res = curr2;
        Node next1 = null;
        Node next2 = null;
        while(curr1!=null){
            next2 = curr2.next;
            curr2.next = curr1;
            next1 = curr1.next;
            curr1.next = next2;
            curr1 = next1;
            curr2 = next2;
        }
        return res;
    }



private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        
        return prev;
    }



private static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



 private static Node findLastNode(Node head) {
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
        }
        return curr;
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