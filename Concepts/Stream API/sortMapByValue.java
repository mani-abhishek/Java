/* 
 * LinkedHashMap maintain the order when we put some data
 * HashMap will do not maintain any order
 * TreeMap store data in sorted order by key(ASCII value)
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class sortMapByValue {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Zia", 667);
        map.put("Manoj", 3);
        map.put("Abhi", 7);
        map.put("vicky", 45);
        System.out.println(map);

        //Sort HashMap by Value using Stream
        LinkedHashMap<String,Integer> sortedMap =   map.entrySet().stream().sorted((e1,e2)->{
            return e1.getValue()-e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(sortedMap);


        // method1();
    }

    private static void method1() {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(667,"Zia");
        map1.put(3,"Manoj");
        map1.put(7,"Abhi");
        map1.put(45,"Vicky");
        System.out.println(map1);
        TreeMap<Integer,String> map2 = new TreeMap<>();
        map2.put(667,"Zia");
        map2.put(3,"Manoj");
        map2.put(7,"Abhi");
        map2.put(45,"Vicky");
        System.out.println(map2);
        TreeMap<String,Integer> map3 = new TreeMap<>();
        map3.put("Zia", 667);
        map3.put("Manoj", 3);
        map3.put("Abhi", 7);
        map3.put("Vicky", 45);
        System.out.println(map3);
    }
}
