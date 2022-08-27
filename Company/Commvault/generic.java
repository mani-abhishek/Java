import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class generic {

    public static void main(String[] args) {
        Integer Iarr[] = {5,5,6,8,910,45,45,6,7,0};
        gen<Integer> obj = new gen<>(Iarr);
        // gen<Number> obj = new gen<>(Iarr);
        System.out.println(obj.getmax());

        // Float Farr[] = {4.6F,89.56F,6.789F,3.67F};
        // gen<Float> obj1 = new gen<>(Farr);
        // System.out.println(obj1.getmax());


        // Double Darr[] = {5.6,89.4545,676.678,1.767,78.89898};
        // gen<Double> obj2 = new gen<>(Darr);
        // System.out.println(obj2.getmax());


    }
}

class gen<T extends Comparable<T>>{
    List<T> list = new ArrayList<>();
    gen(T arr[]){
        Collections.addAll(list, arr);
    }
    public T getmax(){
        T one  = list.get(0);
        T ans=one;
        for (int i = 1; i < list.size(); i++) {
            if(ans.compareTo(list.get(i))<0){
                ans = list.get(i);
            }
        }
        return ans;
    }
}