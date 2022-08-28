public class p2 {
    public static void main(String[] args) {
        System.out.println(solve(83557));
    }
    public static int solve(int n)
    {
        int sum = 0;
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        if(sum==1) return 1;
        else return 0;
    }
}
