import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        int s = num.length;
       System.out.println(myFun(num,s));
    }

    private static int myFun(int[] num, int s) {
        int ans[]  = new int[s];
        for (int i = 0; i < num.length; i++) {
            ans[i] = findSum(num, i);
        }
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        return ans[s-1];
    }
    public static int findSum(int a[],int ind){
        int sum=0;
        // int x = ind+2;
        for (int i = ind; i < a.length; i=i+2+ind) {
            sum = sum+a[i];
        }
        return sum;
    }
}
