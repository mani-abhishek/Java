public class demo1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        s1.append("Abhi");
        System.out.println("String 1st = "+s1);

        StringBuilder s2 = new StringBuilder();
        s2.append("Abhi");

        System.out.println("String 2nd = "+s2);

        System.out.println("Using .equals Method = "+s1.equals(s2));
        // if(s1==s2)
        System.out.println("Give an error");
        System.out.println(s1);
        System.out.println(s1.compareTo(s1.reverse()));
        System.out.println(s1);
        
    }
}
