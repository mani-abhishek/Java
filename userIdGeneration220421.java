import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class generation
{
    String s1,s2;
    int PIN,n;
    String small,longer,fin;
    generation(String s1,String s2,int PIN,int n)
    {
        this.PIN=PIN;
        this.n=n;
        this.s1=s1;
        this.s2=s2;
    }
    String st()
    {
       
        int l1,l2,l3;
        String pin=Integer.toString(PIN); 
        l1=s1.length();
        l2=s2.length();
        l3=pin.length();
       
        if (l1>l2) {
            small=s2;
            longer=s1;
            fin=small.charAt(l1-1)+longer+pin.charAt(n-1)+pin.charAt(l3-n);
            return fin;
        }
        else if (l1==l2) 
        {
            for (int i = 0; i < l1;i++) 
            {
                if (s1.charAt(i)<s2.charAt(i)) 
                {
                    small=s2;
                    longer=s1;
                    break;
                }
                else
                {
                    small=s1;
                    small=s2;
                    break;
                }
            }
            fin=small.charAt(l1-1)+longer+pin.charAt(n-1)+pin.charAt(l3-n);
            return fin;
        }
        else
        {
            small=s1;
            longer=s2;
            fin=small.charAt(l1-1)+longer+pin.charAt(n-1)+pin.charAt(l3-n);
            return fin;
        }

    }
    void displat()
    {
        System.out.println(st());
    }
}
public class userIdGeneration220421 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        int PIN,n;
        s1="Rajiv";
        s2="Roy";
        PIN=560037;
        n=6;
        generation obj= new generation(s1, s2, PIN, n);
        obj.displat();
    }
}
