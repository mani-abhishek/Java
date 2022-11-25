import java.util.*;
public class v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        
        System.out.print(maxWater(arr, size));
        sc.close();
        
    }
    public static int maxWater(int[] arr, int n)
    {
 
        int res = 0;
 
        for (int i = 1; i < n - 1; i++) {
 
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
 
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
}
