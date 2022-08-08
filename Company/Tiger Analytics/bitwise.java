import java.util.ArrayList;
import java.util.Collections;
public class bitwise {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int num []  = { 9, 2, 3,4 };
        printGroups(num, 0, "",a);
        a.add(0);
        a.add(0);
        a.add(0);
        Collections.sort(a);
        System.out.println(a);
        int c=0;
        for (Integer i : a) {
            if(i!=0) break;
            c++;
        }
        int result = a.get(a.size()-1)-a.get(c);
        System.out.println(result);


        // String s="(1,2),(3)";
        // convert(s);
    }

    static void printGroups(int[] a, int start, String output,ArrayList<Integer> l5) {
        output = output + "(" + a[start];
        for (int i = start + 1; i < a.length; i++) {
            printGroups(a, i, output + "),",l5);
            output = output+ "," + a[i];
        }
        output += ")";
        l5.add(convert(output));
        // System.out.println(output);
        
    }
    static int convert(String s){
        // System.out.println(s);
        int ans =0;
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')'){
                if(l.size()==1){
                    l1.add(l.get(0));
                }
                else{
                    l1.add(andOperation(l));
                }
                l.clear(); 
            }
            else if(s.charAt(i)!='('&&s.charAt(i)!=','){
                int x= s.charAt(i)-'0';
                l.add(x);
            }
        }
        ans = orOperation(l1);
        
        return ans;
    }

    static int andOperation(ArrayList<Integer> l){
        int ans=l.get(0);
        l.remove(0);
        for (Integer i : l) {
            ans =ans&i;
        }
        // System.out.println("And="+ans);
        return ans;
    }
    static int orOperation(ArrayList<Integer> l){
        int ans=l.get(0);
        l.remove(0);
        for (Integer i : l) {
            ans =ans|i;
        }
        // System.out.println("Or= "+ans);
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