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
        
        System.out.println(st.capacity()); // return capacity of stack i.e 10 currently
        System.out.println(st.size()); // return how many element present in stack
        System.out.println(st.clone());
        System.out.println(st.empty());
        st.clear();//to make empty stack
        st.push(6);
        System.out.println(st.hashCode());

        System.out.println(st.isEmpty());
    }

}