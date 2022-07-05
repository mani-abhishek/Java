import java.util.Stack;


public class intro {
    public static void main(String[] args) {
        System.out.println("------------------------------= Welcome to Stack =------------------------------");
        Stack <Integer> st = new Stack<>();  // Declaration of Stack 
        


        //List of method
        st.push(3);  //add data into stack
        st.push(5); //add data into stack
        System.out.println(st.pop()); //remove data from stack
        System.out.println(st.peek()); // to see top of the stack
    }

}