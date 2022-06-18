public class program2 {
    public static void main(String[] args) {
        String str = "aabbbccd";
        operation(str);
    }
    public static void operation(String str){
        String s = str;
        int count=0;
        String result = "";
        for (int i = 0; i < s.length()-1; i++) {
            
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                count = count+1;
                String res = s.charAt(i)+Integer.toString(count);
                result = result+res;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
