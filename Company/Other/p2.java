public class p2 {
    public static void main(String[] args) {
        int num = 1455541;
        System.out.println(getNextPallindrome(num));
    }

    public static int getNextPallindrome(int num) {
        if(num<10){
            return num+1;
        }
        String st = String.valueOf(num);
        StringBuilder r = new StringBuilder(st).reverse();
        if(st.equals(r.toString()))return num;
        
        if(st.length()%2==0){
            String res = st.substring(0,st.length()/2);
            StringBuffer s = new StringBuffer(res);
            s.reverse();
            return Integer.parseInt(res+s);
           
        }
        else{
            int len = st.length();
            String s1 = st.substring(0, len/2);
            StringBuilder rev = new StringBuilder(s1).reverse();
            int mid = st.charAt(len/2)-'0'+1;
            String res =  s1+mid+rev; 
          
            return Integer.parseInt(res);
        }
       
    }
}
