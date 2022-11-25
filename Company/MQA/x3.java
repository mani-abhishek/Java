public class x3 {
    public static void main(String[] args) {
        int n = 578;
        System.out.println(discountAMT(n));
    }

    public static int discountAMT(int ordervalue) {
        int answer = 0;
        int rem;
        while(ordervalue!=0){
            rem = ordervalue%10;
            if(rem==2||rem==3||rem==5||rem==7)
            answer+=rem;
            ordervalue/=10;
        }
        return answer;
    }
}
