// IESoft Technologies Private Limited
// Java Development internship
public class program1 {
    public static void main(String[] args) {
        String str  = "fun&!! time"; 
        operration(str);
    }
    public static void operration(String str){
        String s = str;
        String result = "";
        String word [] =  s.split(" ");
        for (int i = 0; i < word.length; i++) {
            String st = removePunctuations(word[i]);
            if()
        }

    }
    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }
}
