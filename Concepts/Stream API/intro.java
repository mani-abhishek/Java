import java.util.Arrays;
import java.util.List;

public class intro {
    public static void main(String[] args) {
        List <Integer> number = Arrays.asList(1,4,6,8,9);
        System.out.println(number);

        number.stream().forEach(System.out::println);
    }
    
}