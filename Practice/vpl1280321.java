import java.util.Scanner;
public class vpl1280321 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        int res1 []=res(a);
        for (int i : res1) {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("");
        System.out.println(res1[0]+" "+sum);
    }
    static int[] res(int a[])
    {
        //int b=a;
        int l=a.length;
        int c[]=new int[l];
        c[l-1]=a[l-1];
        //int sum=c[l];
        for (int i = l-2; i >= 0; --i) {
            c[i]=a[i]-c[i+1];
            //sum=sum+c[i];
        }
        
        //c[l]=sum;
        return c;
    }
    
}
