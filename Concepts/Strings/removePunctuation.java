public class removePunctuation {
    public static void main(String[] args) {
        String str = "love,&?";
        System.out.println(removePunctuations(str));
    }
    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }
}
