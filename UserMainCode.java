import java.io.*;
import  java.util.*;
public class UserMainCode
{
public static int MostFrequentDigit(int input1, int input2, int input3, int input4){
int arr[]={input1,input2,input3,input4};
        int temp[]=new int[10];
        int num;
        for(int i=0;i<arr.length;i++)
        {   num=arr[i];
            while(num!=0)
            {
                int n=num%10;
                temp[n]++;
                num/=10;
            }
        }
        int max=-1;
        int x=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>=max)
            {
                max=temp[i];
                x=i;
            }
        }
    return x;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int k=in.nextInt();
        int l=in.nextInt();
       System.out.println(MostFrequentDigit(i,j,k,l));
    }
}