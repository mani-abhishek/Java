public class sid2 {
    public static void main(String[] args) {
        int n=25;
        System.out.println(getBinary(n));
    }

    public static int getBinary(int num) {
        return Integer.parseInt(Integer.toBinaryString(num));
    }
}
