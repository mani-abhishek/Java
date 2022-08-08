import java.util.Scanner;

public class height {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i =0;
        while(i<4){
            System.out.println("Enter key = ");
            int key = sc.nextInt();
            switch (key) {
                case 0:
                int arr[]={1,1};
                myFun(arr);
                break;
                case 1:
                int arr1[]={};
                myFun(arr1);
                break;
                case 2:
                int arr2[]={1,2,3,4,5};
                myFun(arr2);
                break;
                default:
                    break;
            }
            
        }
    }

    private static void myFun(int[] arr) {
        int n = arr.length;
        if(n==0){
            System.out.println("not found");
        }else{
            for (int i = 0; i < n; i++) {
                int temp = arr[i];
                int c =0;
                for (int j = 0; j < i; j++) {
                    if(arr[j]<temp){
                        c++;
                    }
                }
                if(c==0){
                    System.out.print(-1+" ");
                }else{
                    System.out.print(c+" ");
                }
            }
        }
        
    }
}