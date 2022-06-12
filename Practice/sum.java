class sum
{
   public static void main(String [] args)
{
        int num=Integer.parseInt(args[0]);
        int sum=0,r;
        r=num%10;
        sum=sum+r;
        num=num/10;
       
        r=num%10;
        sum=sum+r;
        num=num/10;

        r=num%10;
        sum=sum+r;
        num=num/10;
        
        r=num%10;
        num=num/10;
        sum=sum+r+num;
 
        System.out.println("Sum of Digit = "+sum);
}


}
