import java.util.Scanner;


public class intro {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // System.out.println("Enter Name =");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
        } catch (Exception e) {
            //TODO: handle exception
        }


        finally{
            sc.close();
        }
    }
    public static void method1(){
        // take char input in java using java
        char c = sc.next().charAt(0);
    }
}