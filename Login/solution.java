import java.util.Scanner;

public class solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        printMatrix(n);
        in.close();
    }

    public static void printMatrix(int n) {

        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j < n; j++) {

                System.out.print(k + " ");
                k++;
                if (k > n) {
                    k = 1;
                    System.out.print(k + " ");
                    k++;
                }
                if (i == 1 && j == n-1) {
                    System.out.print(n + " ");
                }
            }

            System.out.println();
        }
    }
}