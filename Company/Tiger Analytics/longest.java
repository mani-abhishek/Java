public class longest {
    public static void main(String[] args) {
        // int input2[] = {11,3,4,7,8,12,2,3,7} ;
    
        int input2[] = {1,3,2,1} ;

        int input1 = input2.length;
        
        longestSequence(input2,input1);
        
    }

    private static void longestSequence(int[] arr, int l) {
        int count = 1;
        int ans=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]) {
                ++count;
            }else {
                if(ans<count) ans=count;
                count=1;
            }
        }
        System.out.println(ans);
    }
}
