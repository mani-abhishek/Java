import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class example1 {
    public static void main(String[] args) {
        List <employee> emp = new ArrayList<employee>();
        emp.add(new employee("Abhishek", 21, "male", "Computer Science"));
        emp.add(new employee("Abhinav", 24, "male", "HR"));
        emp.add(new employee("Shalini", 19, "female", "Computer Science"));
        emp.add(new employee("Vicky", 22, "male", "Computer Science"));
        emp.add(new employee("Ankit", 21, "male", "Civil"));
        emp.add(new employee("Vandana", 18, "female", "mechanical"));
        emp.add(new employee("Siddharth", 26, "male", "IT"));



        emp.stream().map(employee::getDepartment).distinct().forEach(System.out::println);;
        // System.out.println(emp);
        
        
    }
}
