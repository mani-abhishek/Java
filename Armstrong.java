import java.util.Scanner;

class Armstrong
{
   public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        int num,n,rem;
        System.out.print("Enter a Number: ");
        n=sc.nextInt();
        num=n;
        int sum=0;
        while(n>0)
        {
           rem=n%10;
           sum=sum+(rem*rem*rem);
           n=n/10;
        }
        String res= sum==num ? "Number is Armstrong":"Number is not an Armstrong Number";
        System.out.println(res);
       }
}