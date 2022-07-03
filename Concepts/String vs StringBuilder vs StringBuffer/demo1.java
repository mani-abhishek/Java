public class demo1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s3 = new StringBuffer("Abhi");
        s1.append("Abhi");
        System.out.println("String 1st = "+s1);

        StringBuilder s2 = new StringBuilder();
        s2.append("Abhi");

        System.out.println("String 2nd = "+s2);

        System.out.println("Using .equals Method = "+s1.equals(s3));
        if(s1==s3)
        System.out.println("Give an error");
        // System.out.println(s1.reverse());
        System.out.println(s1.compareTo(s3));
        System.out.println(s1);


        System.out.println(s1.subSequence(0, 1));
        System.out.println(s1.substring(0,1));
    }
}
