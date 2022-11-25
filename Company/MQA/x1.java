import java.util.ArrayList;
import java.util.Arrays;

public class x1 {
    public static void main(String[] args) {
        int[] a = {29,38,12,48,39,55};
        int s = 30;
        int e = 50;
        System.out.println(Arrays.toString(funcDistance(a, s, e)));

    }

    public static int[] funcDistance(int[] inputDist,int start,int end){
        ArrayList<Integer> list = new ArrayList<>();
       
        for (int i = 0; i < inputDist.length; i++) {
            if(inputDist[i]>=start && inputDist[i]<=end)
                list.add(inputDist[i]);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
    
}
