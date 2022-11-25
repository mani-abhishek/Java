public class sid1 {
    public static void main(String[] args) {
        int a[] ={9,-3,8,-6,-7,8,10};
        System.out.println(productAtNegativeTemp(a));
    }

    public static int productAtNegativeTemp(int[] temperature) {
        int answer =0;
       
        for (int i = 0; i < temperature.length; i++) 
            if(temperature[i]<0)answer++;
        

        return answer;
       
    }
}
