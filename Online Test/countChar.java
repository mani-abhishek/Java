// Ques : Count character continuesly in String
public class countChar {
    public static void main(String[] args) {
        String str = "aabbbcc";
        // operation(str);
        testing(str);
    }
    public static void testing(String s){
        int count = 0;
        String res = "";
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                count++;
            }
        }
    }
    public static void operation(String str){
        String s = str;
        int count=0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            
            if(i==s.length()-1){
                count = count+1;
                result = result+s.charAt(i)+Integer.toString(count);
                count = 0;
            }
            else if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                count = count+1;
                result = result+s.charAt(i)+Integer.toString(count);
                count = 0;
            }
        }
        System.out.println(result);
    }

}
