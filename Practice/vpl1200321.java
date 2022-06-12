// import java.util.Scanner;
// public class vpl1200321 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         //String st []= new String[5];
//         for (int i = 0; i < n; i++) {
            
//             String s=sc.nextLine();
            
//             ss(s);
//             //int num=sc.nextInt();
//         }
        
//     }
//     static void ss(String st)
//         {
//             String s1="";
//             String str[]=st.split(" ");
//             for (int i = 0; i < str.length; i++) {
//                 for (int j = i+1; j < str.length; j++) {
//                     if(str[i].equalsIgnoreCase(str[j]))
//                     {
//                         s1=s1+str[i]+" ";
//                     }
//                 }
                
//             }
//             //System.out.println(st);
//             System.out.println(s1);
//         }
// }
import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vpl1200321 {

public static void main(String[] args) {

String regex = "\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
 Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

Scanner in = new Scanner(System.in);
 int numSentences = Integer.parseInt(in.nextLine());
 
 while (numSentences-- > 0) {
 String input = in.nextLine();
 
 Matcher m = p.matcher(input);
 
 // Check for subsequences of input that match the compiled pattern
 while (m.find()) {
 input = input.replaceAll(m.group(), m.group(1));
 }
 
 // Prints the modified sentence.
 System.out.println(input);
 }

 in.close();
 }
}
