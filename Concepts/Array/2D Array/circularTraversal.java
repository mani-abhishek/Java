import java.util.Arrays;

public class circularTraversal {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        // output 1,2,3,4,5,10,15,14,13,12,11,6,7,8,9
        int n = 3;
        int m = 5;
        printList(arr);
        solve(arr,n,m);
    }
    private static void solve(int[][] arr, int m, int n) {
        int x=0;
        int len = m*n;
        int i=0;
        int j=0;
        
        while(x<=len){
            while(j<n&&x<=len){
                System.out.print(arr[i][j++]+",");
                x++;
            }
            i++;
            j--;
            while(x<=len&&i<m){
                System.out.print(arr[i++][j]+",");
                x++;
            }
            i--;
            while(x<=len&&j>=0){
                System.out.print(arr[i][j--]+",");
                x++;
            }
            j=j+1;
            i=i-1;
            while(x<=len&&i>=1){
                System.out.print(arr[i--][j]+",");
                x++;
            }
            i=i+1;
            j=j+1;
            // System.out.println(i+" = "+j);
            // break;
        }
        
    }
    private static void printList(int arr[][]){
        for(int a[]:arr)
        System.out.println(Arrays.toString(a));
    }
}