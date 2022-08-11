import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        emp.add(new employee("Siddharth", 26, "male", "IT"));


        // // find distinct department name
        // emp.stream().map(employee::getDepartment).distinct().forEach(System.out::println);
        
        // //Count how many employee each department have.
        // Map <String,Long> departmentCount = 
        // emp.stream().collect(Collectors.groupingBy(employee::getDepartment,Collectors.counting()));
        // System.out.println(departmentCount);
        
        //find average age of male and female
        Map <String,Double> grnderAverage = emp.stream().collect(Collectors.groupingBy(employee::getGender,Collectors.averagingDouble(employee::getAge)));
        System.out.println(grnderAverage);
        
    }
}
