public class ankit1 {
    public static void main(String[] args) {
        int s=4;
        int x=3;
        int t=5;
        System.out.println(funcEnergy(s,x,t));
    }

    public static int funcEnergy(int intialEnergy, int rate, int timeN) {
        return  ((timeN-1)*rate)+intialEnergy;
    }
}
