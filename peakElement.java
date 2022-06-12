import java.util.Scanner;
public class peakElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Abhi");
        int arr []={2,4,5,6,8,3};
        int size = arr.length;
        peak(arr,size);
    }
    public static void peak(int arr [],int size){
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i!=0 && i!=size-1){
                if(arr[i]>arr[i-1]&& arr[i]>(i+1)&& peak < arr[i]){
                        peak=arr[i];
                }
            }
        }
        if(peak!=0)
        System.out.print(peak);
        else
        System.out.print("No Peak Element");
    }
}
