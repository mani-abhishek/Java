import java.util.Arrays;
public class sumOfContiguousSubArray {
    public static void main(String[] args) {
        // int[] arr = {-1,3,5,7,-2,7};
        int[] arr =  {-2, -3, 4, -1, -2, 1, 5, -3};
        method2(arr);
        sum(arr);
        
    }
    private static void method2(int[] arr) {
        int max_so_far = arr[0];
        int curr_max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr_max = Math.max(arr[i],curr_max+arr[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        System.out.println(max_so_far);
    }
    private static void sum(int[] arr) {
        int sum=0;
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print("sum = "+sum);
            sum+=arr[i];
            // System.out.println("  arr["+i+"] = "+arr[i]+" Sum = "+sum);
            if(ans<sum) ans = sum;
            if(sum<0) sum=0;
        }
        System.out.println(ans);
    }
}
