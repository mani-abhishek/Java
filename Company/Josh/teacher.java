public class teacher {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,1};
        int k =3;
        myFun(arr,k);
    }

    private static void myFun(int[] arr,int k) {
        int c=0;
        
        
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                c++;
                continue;
            }
            sum=sum+arr[i];
            if(sum==k){
                c++;
                sum=arr[i];
            }
        }
        System.out.println(c);
    }
}
