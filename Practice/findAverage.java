
public class findAverage {

    public static void main(String[] args) {
        int arr [] = {4,5,8,3,9,1,7,8,2,1};
        System.out.printf("Average = %.3f",avg(arr));
    }
    private static double avg(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[0]>a[i]){
                int temp = a[0];
                a[0] = a[i];
                a[i] =temp;
            }
        }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[0]<a[i]){
                int temp = a[0];
                a[0] = a[i];
                a[i] =temp;
            }
        }
        int max = a[0];
        double lowSum = sum(a,min);
        double highSum = sum(a,max);
        double res = (lowSum+highSum)/((lowSum/min)+(highSum/max));
        // System.out.println("Result = "+res);
        System.out.println("          "+(lowSum+highSum)+"/"+((lowSum/min)+(highSum/max))+" ");
        return res;
    }
    public static double sum(int a[],int n){
        double sum = 0;
        for (int ele:a) if(ele==n) sum = sum + ele;
        return sum;
    }
}  