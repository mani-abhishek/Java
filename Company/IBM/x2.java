
public class x2 {
    public static void main(String[] args) {
        String str = "helloslkhellodjladfjhello";
        String findStr = "hello";
        System.out.println(str.split(findStr, -1).length-1);
    }
}
