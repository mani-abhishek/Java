public class stringStringBufferStringBuilder {
    public static void main(String[] args) {
        String name = "Abhishek";
        concat1(name);
        StringBuilder name1 = new StringBuilder("Abhishek");
        concat2(name1);
        StringBuffer name2 = new StringBuffer("Abhishek");
        concat3(name2);
        System.out.println(name);
        System.out.println(name1);
    }
    public static void concat1(String s){
        s = s+" Mani";
    }
    public static void concat2(StringBuilder s){
        s.append(" Mani");
    }
    public static void concat3(StringBuffer s){
        s.append(s);
    }
}


