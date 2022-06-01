import java.util.Scanner;
public class sol5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        fun(range);
        in.close();
    }
    public static void fun(int n)
    {
        int k=33;
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            System.out.print(k+",");
            sum=sum+k;
            k=k+i;
        }
        System.out.println("\nSum = "+sum);
        System.out.println("Average = "+sum/n);
    }
}
