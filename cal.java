import java.util.Scanner;
class cal
{
     public static void main(String [] args)
       {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter radius :");
         int r=sc.nextInt();
         System.out.print("Enter Height:");
         int h=sc.nextInt();
         double a,c;
         a=3.12*r*r;
         c=6.24*r;
         System.out.println("Area of a Circle = "+ a);
         System.out.println("Circumference of a Circle ="+c);
         System.out.println("Volume of Cylinder ="+(a*h));
         System.out.println("Surface area of the closed cylinder ="+(c*(r+h)));
         System.out.println("Volume of Sphere ="+(4.0/3*a));
       }
}