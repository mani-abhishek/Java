public class numberToIndianFormat {
    public static void main(String[] args) {
        long num = 344555464566756897L;
        func(num);
    }

    private static void func(long num) {
        StringBuilder str = new StringBuilder(num+"");
        // System.out.println(str);
        int len = str.length()-3;
        str.insert(len, ',');
        len=len-2;
        for (int i = len; i > 0; i=i-2) {
            System.out.println(str.length());
            str.insert(i, ',');  
        }
        System.out.println(str);
    
    }
}
