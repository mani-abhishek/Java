// by default it implements Max Heap


import java.util.PriorityQueue;

public class intro {
    public static void main(String[] args) {
        
    }
    public static void demo(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(50);
        pq.add(1);
        System.out.println(pq.peek());
        
    }
}
