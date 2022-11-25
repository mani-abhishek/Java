import java.util.*;

public class dup {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
        
        

    }  
    public int[] DuplicateArray(int input1,int input2[]){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < input2.length; i++) {  
            for(int j = i + 1; j < input2.length; j++) {  
                if(input2[i] == input2[j])  
                    a.add(input2[j]);  
            }  
        }  
        
        int res[] = new int[a.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=a.get(i);
        }
        Arrays.sort(res);
        return res;
        
    }
}  