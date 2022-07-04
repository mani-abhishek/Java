import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class removeParenthesis301 {

    public String toString(){
        return 
    }

    public static void main(String[] args) {
        // System.out.println("welcome");
        String s = ")("; // Output: ["(())()","()()()"]
        // String s = "()()))()"; 
        // String s = "()()(()"; 
        Stack<Character> st = new Stack<>();
        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (st.empty()) {
                st.push(ch);
            } else if(st.peek()=='(') {
                st.pop();
            }else st.push(ch);
            i++;
        }
        String ss = st.toString();
        System.out.println(ss.charAt(0));
        // System.out.println(st.toString());

        // int p1 = 0;
        // while (s.charAt(i-1)==s.charAt(p1)) {
        //     p1++;
        // }
        // System.out.println(st);
        // System.out.println(s1);
        // System.out.println(i+" "+s.charAt(i-1));
        // System.out.println(p1);
        
        // System.out.println(s.substring(0,i-1) + s.substring(i));


        // System.out.println("-------------------------------");

        // list.add(s.substring(0,p1) + s.substring(p1+1));
        // list.add(s.substring(0,i-1) + s.substring(i));

        // System.out.println(list);

    }
}