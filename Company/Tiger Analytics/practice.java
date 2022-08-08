import java.util.Arrays;

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        String s = "(11),(22),(33)";//(11),(22.33)
        split(s);
    }

    private static void split(String s) {
        String str [] = s.split("," );
        System.out.println(Arrays.toString(str));
    }
}