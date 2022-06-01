import java.util.Scanner;
public class sol3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if(n>4&&n<=12)
        printMatrix(n);
        in.close();
    }

    public static void printMatrix(int n) {
        int k=10;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
               
                System.out.print(k+" ");
               if(j!=i)
               {
                k=k+1;
               }
               
            }
            k=k+2;
            System.out.println();
        }
    }
}
