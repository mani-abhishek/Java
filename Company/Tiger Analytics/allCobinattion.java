public class allCobinattion {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int s = 3;
        myFun(arr,0,s,"");
    }

    private static void myFun(int[] arr, int s,int r,String str) {
        if(r==str.length())
        System.out.println(str);

        str = str+arr[s];
        for (int i = s+1; i < arr.length; i++) {
            myFun(arr, i,r,str);
            str=str+arr[i];
        }
        System.out.println(str);
        
    }
}
