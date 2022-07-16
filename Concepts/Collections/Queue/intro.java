import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class intro {
    public static void main(String[] args) {
        // 1 method to implement Queue
        Queue<Integer> q = new LinkedList<>();
        //2 method to implement Queue
        LinkedList<Integer> q1 = new LinkedList<>();

        Deque<Integer> q2 = new ArrayDeque<>();
        q.add(10);
        q.poll();
        q.peek();
        q.size();
        System.out.println(q);
    }
}
