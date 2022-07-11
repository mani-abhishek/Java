import java.util.ArrayList;
import java.util.Arrays;

/**
 * intro
 */
public class intro {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4, 8);
        

        // System.out.println(list);
        fun();
    }
    public static void fun(){
        String face= "N";
        String dir = "NESW";
        int ind = dir.indexOf(face);
        System.out.println(ind);

        String [] str = {"A","B","C"};
        String st = "ABC";
        int i = st.indexOf("B");
        System.out.println(st.indexOf("B"));
        System.out.println(st.substring(0,1));
        System.out.println(st.substring(i-1,i));
    }
}