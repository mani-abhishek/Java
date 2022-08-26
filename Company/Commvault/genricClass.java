import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class genricClass {
    public static void main(String[] args) {
        Integer Iarr[] = {2,5,7,2,2,7,10};
        Stats<Integer> obj1 = new Stats<Integer>(Iarr);
    }
}

class Stats<T>{
    ArrayList<T> list = new ArrayList<>();
    // ArrayList <T> list;
    public Stats(T arr[]){
        // list = Arrays.asList({1,3,5}); ----not allowed
        Collections.addAll(list, arr);
    }
    public T getMax(){
        list.


    }
    
}