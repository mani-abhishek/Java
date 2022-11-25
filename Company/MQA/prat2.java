import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prat2 {
    public static void main(String[] args) {
        int a[]= {10,98,3,33,12,22,21,11};
        System.out.println(Arrays.toString(funcArrange(a)));
    }

    public static int[] funcArrange(int[] inputArr) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < inputArr.length; i++) {
            if(inputArr[i]%2==0) even.add(inputArr[i]);
            else odd.add(inputArr[i]);
        }
       

        int [] answer = new int[inputArr.length];
        int ind=0;
        for (int i = 0; i < answer.length; i++) {
            if(i<even.size()){
                answer[i] = even.get(i);
            }
            else {
                answer[i] = odd.get(ind);
                ind++;
            }
        }
        return answer;

    }
}
