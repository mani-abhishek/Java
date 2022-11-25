import java.util.*;
class Solution{
    static int sol(int a, int b, int x, int y){
        if( a == x && b == y)
            return 1;
        
        return Math.min(sol(a+b, a, x, y), sol(a, a+b, x, y));
           
        
        
    }
    static void ans(int x, int y){
        System.out.println(sol(1, 1, x, y));
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
            // x = sc.nextInt();
            // y = sc.nextInt();
            x=3;
            y=2;
            ans(x, y);
        
    }
    
}