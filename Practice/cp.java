import java.util.Scanner;
class cp
{
    public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Selling Price of 15 Item :");
        double sp=sc.nextDouble();
        System.out.print("Enter the Total Profit : ");
        double p=sc.nextDouble();
        System.out.println("Cost Price of One Item = "+(sp-p)/15);
      }
}
