import java.util.Scanner;

public class intro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // System.out.println("Enter Name =");
            int age = sc.nextInt();
            System.out.println("Your age is " + age);
            // method1(sc);
            specialCase(sc);
        } catch (Exception e) {
            // TODO: handle exception
        }

        finally {
            sc.close();
        }
    }

    private static void specialCase(Scanner sc) {
        int n = sc.nextInt();
        String name = sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < 5; i++) {
            String a = sc.nextLine();
            System.out.println(i+" = "+a);
        }
    }

    public static void method1(Scanner sc) {
        // take char input in java using java
        char c = sc.next().charAt(0);
    }
}