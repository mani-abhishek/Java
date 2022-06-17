// IESoft Technologies Private Limited
// Java Development internship
public class program1 {
    public static void main(String[] args) {
        String str  = "fun&!! time"; 
        String str1 = "I love dogs present at my home";
        operration(str1);
    }
    public static void operration(String str){
        String s = str;
        String result = "";
        String word [] =  s.split(" ");
        for (int i = 0; i < word.length; i++) {
            String st = removePunctuations(word[i]);
            if(result.length()<st.length())
            result = st;
        }
        System.out.println(reverse(result));
    }
    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }
    public static String reverse(String s){
        String res = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            res+=ch;
        }
        
        return res;
    }
}
