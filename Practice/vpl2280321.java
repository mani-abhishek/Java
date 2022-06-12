import java.util.Scanner;
public class vpl2280321 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a []=new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        //res(a);
        System.out.println(res(a));

    }
    static int res(int array[])
    {
        int arr[]=new int[9];
        int i=0,n=1;
        int res=0;
        boolean b1=false;
        for (int j = 0; j < array.length; j++) 
        {
            int a= array[0]%10;
            arr[i]=a;
            array[0]=array[0]/10;

            int b= array[1]%10;
            arr[i+1]=b;
            array[1]=array[1]/10;

            int c=array[2]%10;
            arr[i+2]=c;
            array[2]=array[2]/10;


            if ( a <= b && a <= c )
            {
                res=res+(a*n);
                
            }
            else if ( b < a && b < c )
            {
                res=res+(b*n);
                
            }
            else if ( c < a && c < b )
            {
                res=res+(c*n);

            }
            n=n*10;
            i=i+3;

        }
        int k=9;
        while(k<=9&&k>0)
        {
            for (int j = 0; j < arr.length; j++) {
                if (k==arr[j]) {
                    //System.out.println(arr[j]);
                    b1=true;
                    res=res+(1000*arr[j]);
                    break;
                }
            }
            if (b1)
            {
                break;
            }
            k--;
        }
        return res;
    }
}
