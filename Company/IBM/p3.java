import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solve(n,arr);
        sc.close();
    }

    private static void solve(int n, int[] arr) {
        int minLaddo=1;
        int temp = arr[0];
        int ladoo=1;
        for (int i = 1; i < arr.length; i++) {
            if(temp<arr[i]){
                ladoo=ladoo+1;
                minLaddo=minLaddo+ladoo;
                temp=arr[i];
            }
            else{
                ladoo=1;
                minLaddo=minLaddo+1;
                temp=arr[i];
            }
        }
        System.out.println(minLaddo);
    }
}
