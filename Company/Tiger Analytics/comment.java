public class comment {
    public static void main(String[] args) {
        String str = "a*b//a*biamhere";
        myFun(str);
    }
    static void myFun(String s){
        int ind =0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)=='/'&&s.charAt(i+1)=='/'){
                ind = i;
                break;
            }
        }
        String str1 = s.substring(0, ind);
        String str2 = s.substring(ind);
        System.out.println(str1);

        System.out.println(str2);
        String str3 = str1.replace('*', '@');
        System.out.println(str3+str2);
    }
}
