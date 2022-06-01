/**
 * vpl2210321
 */
import java.util.Scanner;
public class vpl2210321 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String arr []=s1.split(" ");
        String str1 []=newmeth(arr[0]);
        String str2 []=newmeth(arr[1]);
        String str3 []=newmeth(arr[2]);
        System.out.println(str1[0]+str2[0]+str3[0]);
        System.out.println(str1[1]+str2[1]+str3[1]);
        System.out.println(str1[2].toUpperCase()+str2[2].toUpperCase()+str3[2].toUpperCase());
    }
    static String []newmeth(String st)
    {
        int l=st.length();
        String s1=st;
        String a1[]=new String[3];
        if(l%3==0)
        {
            int x1=l/3;
            a1[0]=s1.substring(0,x1);
            a1[1]=s1.substring(x1,x1*2);
            a1[2]=s1.substring(x1*2);
        }
        else if(l%3==1)
        {
            int x2=l/3;
            a1[0]=s1.substring(0,x2);
            a1[1]=s1.substring(x2,x2+2);
            a1[2]=s1.substring(x2+2);
        }
        else
        {
            int x3=l/3;
            a1[0]=s1.substring(0,x3+1);
            a1[1]=s1.substring(x3+1,x3+2);
            a1[2]=s1.substring(x3+2);
        }
        return a1;
    }
    
}