import java.util.Scanner;
class smith
{
    static int sumdig(int n)
     {
       int s=0;
        while(n>0)
          {
           s=s+(n%10);
           n=n/10;
          }
       return s;
     }
    static int sumfactor(int n)
     {
        int i=2,sum=0;
        while(n>1)
         {
           if(n%i==0)
            {
              sum=sum+sumdig(i);
              n=n/i;
            } 
           else
              i++;
         }
        return sum;
     }
 
   public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int a,b;
        a=sumdig(num);
        b=sumfactor(num);
        String res=a==b?" is a Smith Number":" is not a Smith Number";
        System.out.println(num+res);  
     }

}