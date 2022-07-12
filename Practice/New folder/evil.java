import java.util.Scanner;
class evil
{
	static String Binary(int n) 
    {
        int r;
        String s=""; 
        char dig[]={'0','1'}; 
        while(n>0)
        {
        	r=n%2; 
        	s=dig[r]+s; 
            n=n/2;
        }
        return s;
    }
   static int count(String s) 
    {
        int c = 0, l = s.length();
        char ch;
        for(int i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
        return c;
    }
     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        String bin = Binary(n);
        int x = count(bin);
        String res= x%2==0 ? " is an Evil Number...":" is not an Evil Number..";
        System.out.println(n+res);
    }
}