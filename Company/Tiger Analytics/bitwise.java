import java.util.ArrayList;
import java.util.List;

public class bitwise {

    public static void main(String[] args) {
        int input []  =new int[] { 1, 2, 3 };
        // ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer[]> list = new ArrayList<Integer[]>();
        Integer t []= {1,23,4};
        Integer t1 []= {11,23,41};
        list.add(t);
        list.add(t1);
        for (Integer i : list.get(0)) {
            System.out.println(i);
        }
        // System.out.println(list.get(0));
        // printGroups(input, 0, list);
    }

    
    static void printGroups(int[] a, int start, ArrayList<Integer> list[]) {
        output += "(" + a[start];

        list.a
        for (int i = start + 1; i < a.length; i++) {
            printGroups(a, i, output + "),");
            output += "," + a[i];
        }
        System.out.println(output + ")");
    }

    static int andOperation(int a[]){
        
        return 0;
    }
}
