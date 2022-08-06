import java.util.ArrayList;

public class test {

    public static void main(String[] args) {


        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a = new ArrayList<>();
        // a.add(1);
        // a.add(2);
        // a.add(3);
        // list.add(a);
        // System.out.println(list);

        
        int num []  = { 1, 2, 3 };
        // printGroups(num, 0, "");
        String s = "(1),(2,3)";
        convert(s);



        // printGroup(new int[] { 1, 2, 3 }, 0, "");
    }

    static void printGroups(int[] a, int start, String output) {
        
        output = output + "(" + a[start];
        for (int i = start + 1; i < a.length; i++) {
            printGroups(a, i, output + "),");
            output = output+ "," + a[i];
        }
        output += ")";
        convert(output);
        System.out.println(output);
        
    }
    static void convert(String s){
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')'){
                if(l.size()==1){
                    l1.add(l.get(0));
                    l.clear();
                    
                }
                else{
                    l1.add(andOperation(l));
                }
                
            }
            else if(s.charAt(i)!='('&&s.charAt(i)!=','){
                // System.out.println(ch);
                int x= s.charAt(i)-'0';
                // System.out.println("x= "+x);
                l.add(x);
                // System.out.println(l);
            }
        }
        System.out.println(l1);
    }

    static int andOperation(ArrayList<Integer> l){
        System.out.println("Insidse And ");
        int ans=l.get(0);
        l.remove(0);
        for (Integer i : l) {
            ans =ans&i;
            // System.out.println(i);
        }
        return ans;
    }
    static int orOperation(ArrayList<Integer> l){
        int ans=l.get(0);
        for (Integer i : l) {
            ans =ans|i;
            // System.out.println(i);
        }
        return ans;
    }








    // static void printGroup(int[] a, int start, String output) {
    //     output += "(" + a[start];
    //     for (int i = start + 1; i < a.length; i++) {
    //         printGroups(a, i, output + "),");
    //         output =output+ "," + a[i];
    //     }
    //     System.out.println(output + ")");
    // }

}