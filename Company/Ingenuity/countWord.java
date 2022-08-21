import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class countWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        String word = sc.next();
        sc.nextLine();
        TreeMap<Integer,String> map = new TreeMap<>();
        // HashMap <Integer,String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();
            map.put(count(s,word), s);
        }
        // sorted.putAll(map);
        System.out.println(map);
        sc.close();
    }

    private static int count(String s, String word) {
        int c=0;
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if(word.equals(str[i])) c++;
        }
        return c;
    }
}

/* 
4
python
i like to code in python 
python is named after a show named monty python and not after snake python                                                                              
i think python is good i think python is more important than php
i like java

 */