import java.util.HashMap;

public class p1{
    public static void main(String[] args) {
        int arr[] = {2,0,5,0};
        System.out.println(getSum(arr));
    }

    public static int getSum(int[] a) {
        int c=0;
        for (int i = 0; i < a.length; i=i+2) {
            int size = a[i]+a[i+1];
            int pair = (size+1)/2;
            if((size%2==0&& pair%2==0)||(size%2!=0&& pair%2!=0)) c++;

        }
        return c;
    }


    // public void solve(int a[]){
    //     HashMap<Character,Integer> map = new HashMap<>();
        
    //     for (int i = 0; i < a.length; i=i+2) {
    //         int t  = a[i]+a[i+1];
    //         char ch = 'A';
    //         for (int j = 1; j <= t; j=+2) {
    //             map.put(ch, j);
    //             map.put(ch, j+1);
                
    //         }
            
    //     }
    // }
}