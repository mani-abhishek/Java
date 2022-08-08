public class balanced {
    public static void main(String[] args) {
        // int arr[] = {5,1,4,3,6,8,10,7,9};
        int arr[]= {4,3,2,5,7,8};
        muFun(arr);
    }

    private static void muFun(int[] arr) {
        int length = arr.length;
        int min = arr[length-1];
        int max = arr[0];
        int ans=0;
        int l = length-1;
        for (int i = 0; i < length; i++) {
            int curr = arr[i];
            int last = arr[l];
            if(curr>max&&last<min){
                ans = i;
                System.out.println(ans);
                break;
            }else if(curr>max) max=curr;
            else if(last<min) min=last;
            l--;
        }
    }
}
