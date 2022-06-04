import java.util.Scanner;
public class Amcat_23022101 {
    public static void Lexilogical(String a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j])
                {
                    if (a[i].compareTo(a[j])>0) {
                        String temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s=s1.toLowerCase();
        String word []=s.split(" ");
        // for (String w : word) {
        //     System.out.println(w);
        // }
        Lexilogical(word);  
    }
   
}
