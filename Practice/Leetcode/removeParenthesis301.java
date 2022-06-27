
/**
 * 301
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class removeParenthesis301 {

    public static void main(String[] args) {
        System.out.println("welcome");
        String s = ")("; // Output: ["(())()","()()()"]
        Stack<Character> st = new Stack<>();
        List<String> list = new ArrayList<>();
        int i = 0;
        String s1="",s2="";
        int push =0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == s.charAt(0)) {
                st.push(ch);
                s1 += ch;
                push++;
            } else if (st.empty()) {
                st.push(ch);
                push++;
                
            } else {
                st.pop();
                s1 += ch;
                push=0;
            }
            if(push==2)
            break;
            i++;
            
        }
        int p1 = 0;
        while (s.charAt(i-1)==s.charAt(p1)) {
            p1++;
        }
        System.out.println(st);
        System.out.println(s1);
        System.out.println(i+" "+s.charAt(i-1));
        System.out.println(p1);
        
        System.out.println(s.substring(0,i-1) + s.substring(i));


        System.out.println("-------------------------------");

        list.add(s.substring(0,p1) + s.substring(p1+1));
        list.add(s.substring(0,i-1) + s.substring(i));

        System.out.println(list);

    }
}