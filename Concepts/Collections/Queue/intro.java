import java.util.LinkedList;
import java.util.Queue;

public class intro {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.poll();
        q.peek();
        System.out.println(q);
    }
}
