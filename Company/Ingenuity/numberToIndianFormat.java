public class numberToIndianFormat {
    public static void main(String[] args) {
        long num = 344555464566756897L;
        func(num);
    }

    private static void func(long num) {
        StringBuilder str = new StringBuilder(num+"");
        int len = str.length()-3;
        str.insert(len, ',');
        for (int i = len-2; i > 0; i=i-2) {
            System.out.println(i);
            str.insert(i, ',');  
        }
        System.out.println(str);
    
    }
}
