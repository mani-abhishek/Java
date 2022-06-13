// Question : perform n times reverse over substring.
// 1. sweet = ewset,2.ewset = eeswt,3. eeswt = eetws


public class reverseSubstring {
    public static void main(String[] args) {
        System.out.println("Abhishek Mani");
        String str = "sweet";  
        int n =3; 
        reverseString(str,n);
        
    }
    public static String reverseString(String s,int n){
        
        int size = s.length()-(n-1);
        for (int i = 0; i < size; i++) {
            String sub1 = s.substring(0,i);
            String sub2 = reverse(s.substring(i, i+n));
            String sub3 = s.substring(i+n);
            s = sub1+sub2+sub3;
            System.out.println(s);
        }
        return s;
    }
    public static String reverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
