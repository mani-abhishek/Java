import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class toffee {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // boolean opt = true;
        // while(opt){
        //     System.out.print("Enter Number of toffee = ");
        //     int toffee = sc.nextInt();
        //     System.out.print("\nEnter a Number Children = ");
        //     int child = sc.nextInt();
        //     System.out.print("\nEnter your Friend Position = ");
        //     int myFriend = sc.nextInt();
        //     myFun(toffee,child,myFriend);
        // }
        // sc.close();
        
        int toffee = 100;
        int child = 10;
        int myFriend = 3;
        myFun(toffee,child,myFriend);
        
    }

    private static void myFun(int toffee, int child, int myFriend) {
        int arr [] = new int[child];
        int x =toffee;
        for (int i = 0; i < arr.length; i++) {
            if(toffee>0){
                if(x%child==0){
                    arr[i] = child-1;
                    toffee = toffee-(child-1);
                }
                else if(x%child!=0){
                    arr[i] = child;
                    toffee = toffee-child;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(toffee);
        arr[myFriend]= arr[myFriend]+2;
        toffee = toffee-2;
        for (int i = 0; i < arr.length; i++) {
            if(toffee>0 && i!=myFriend){
                // if(toffee>=1){
                    arr[i] = arr[i]+1;
                    toffee=toffee-1;
                // }
            }
        }
        System.out.println("Sum = "+x+" = "+IntStream.of(arr).sum());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[myFriend-1]);
        System.out.println(arr[myFriend]);
        System.out.println(arr[myFriend+1]);
    }
}
