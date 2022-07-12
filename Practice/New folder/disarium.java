import java.util.Scanner;
class disarium
{
   public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n,num,sum=0,a,count=0,rem;
      System.out.print("Enter any Number :");
      n=sc.nextInt();
      num=n;
      while(n>0)
       {
         n=n/10; 
         count++;
       }
      n=num;
      while(n>0)
       {
           a=1;
           rem=n%10;
           n=n/10;
           for(int i=0;i<count;i++)
            {
              a=a*rem;
            }
           sum =sum+a;
           count--;
       }
     String res= num==sum ?"Entered Number is Disarium Number":"Entered Number is not a Disarium Number";
     System.out.println(res);
    }
}