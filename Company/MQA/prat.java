public class prat {
    public static void main(String[] args) {
        int n = 25143;
        int k = 3;
        System.out.println(encryptData(n,k));
    }

    public static int encryptData(int data, int key) {
        String s = String.valueOf(data);
        int len = s.length();
        key = key%len;
        String s1 = s.substring(0,key);
        String s2 = s.substring(key);

        
        return Integer.parseInt(s2+s1);
    }
}
