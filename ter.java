import java.util.Scanner;
class ter
{
    public static void main(String[] args)
       {
        System.out.print("Enter a Number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String re=num%2==0?"Number is Even":"Number is Odd";
        System.out.println(re);
       }
}