import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class test {

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int num[] = {123,345,33};
        subArray(num,0,"",ans); 
        Collections.sort(ans);
        int c=0;
        for (Integer i : ans) {
            if(i!=0) break;
            c++;
        }
        System.out.println(ans);
        int result = ans.get(ans.size()-1)-ans.get(c);
        System.out.println(result);

        // String s = "1-2-3";
        // System.out.println(1&2&3);
        // convert(s);
    }

    private static void subArray(int[] a, int s, String output,ArrayList<Integer> ans) {
        output = output+a[s];
        for (int i = s+1; i < a.length; i++) {
            subArray(a, i, output+",",ans);
            output=output+"-"+a[i];
        }
        ans.add(convert(output));
        // System.out.println(output);
    }

    private static int convert(String s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        String s1[] =  s.split(",");
        for (int i = 0; i < s1.length; i++) {
            String temp = s1[i];
            if(isNumber(temp)){
                l1.add(Integer.parseInt(s1[i]));
            }
            else{
                String s2 [] = temp.split("-");
                int and = Integer.parseInt(s2[0]);
                for (int j = 1; j < s2.length; j++) {
                    and = and&Integer.parseInt(s2[j]);
                }
                l1.add(and);
            }
        }
        int ans = orOperation(l1);
        return ans;
    }

    private static int orOperation(ArrayList<Integer> l1) {
        int ans = l1.get(0);
        l1.remove(0);
        for (Integer integer : l1) {
            ans = ans|integer;
        }
        return ans;
    }

    private static boolean isNumber(String temp) {
        try {
            Integer.parseInt(temp);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}