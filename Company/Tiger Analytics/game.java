public class game {
    public static void main(String[] args) {
        int game[]= {7,8,6,4};
        int total = game.length;
        System.out.println(myFun(game,total));
    }

    private static String myFun(int[] game, int total) {
        int s = 0;
        int l =total-1;
        int a =0;
        int b = 0;
        while (s<l) {
            a = a+game[s];
            b = b+game[l];


            
            s++;
            l--;
        }
        System.out.println("A = "+a+"  B = "+b);
        if(a==b) return "DRAW\n0";
        else if(a>b) return "ABHISHEK\n"+(a-b);
        else return "BITTU\n"+(b-a);
        
    }
}
