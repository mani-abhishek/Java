public class program2 {
    public static void main(String[] args) {
        String str = "aabbbccd";
        operation(str);
    }
    public static void operation(String str){
        String s = str;
        int count;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
    }
}
