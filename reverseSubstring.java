public class reverseSubstring {
    public static void main(String[] args) {
        System.out.println("Abhishek Mani");
        String str = "sweet"; //1. sweet = ewset,2.ewset = eeswt,3. eeswt = eetws  
        reverseString(str);
        
    }
    public static void reverseString(String s){
        
        
        for (int i = 0; i < 3; i++) {
            String sub1 = s.substring(0,i);
            String sub2 = reverse(s.substring(i, i+3));
            String sub3 = s.substring(i+3);
            s = sub1+sub2+sub3;
            System.out.println(s);
        }
    }
    public static String reverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
