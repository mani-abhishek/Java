public class x1 {
    public static void main(String[] args) {
        String s = "alphxxdida";
        StringBuilder input1 = new StringBuilder(s);
        input1.reverse();
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==input1.charAt(i)){
                c++;
            }
        }
        System.out.println(c);
    }
}
