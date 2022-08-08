import java.util.*;
public class signals {
    public static void main(String[] args) {
        int arr[]= {5,5,3,2,5,7,7,5,7,1,4,4};
        int size = arr.length;
        System.out.println(myFun(arr,size));
    }

    private static String myFun(int[] arr, int size) {
        String result = "";
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);


        return result;
    }
}
