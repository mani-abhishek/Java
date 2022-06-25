import java.util.*;
public class demo {
    public static void main(String[] args) {

        List <student> s = new ArrayList<>();
        // student student1 = new student(1,"Abhi");
        // System.out.println(student1.getName());
        s.add(new student(4,"Vicky"));
        s.add(new student(6,"Abhi"));
        s.add(new student(45,"Mani"));
        s.add(new student(2,"Abhishek"));


        Comparator <student> com = new Comparator<student>() {
            public int compare(student s1,student s2){
                // if(s1.getName().equals(s2.getName())){
                //     return 1;
                // }
                // else return -1;
                // return s1.getName().compareTo(s2.getName());
                // if(s1.getRoll()>s2.getRoll())
                // return 1;
                // else return -1;
                // System.out.println(s1.getName().compareTo(s2.getName()));
                if(s1.getName().equals(s2.getName())){
                    
                    return 1;
                }
                else return -1;
                
            }
        };
        
        
        // System.out.println("as");

        System.out.println(s);

        Collections.sort(s,com);

        System.out.println(s);

        

    }
}