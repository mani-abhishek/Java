public class test {
    public static void main(String args[]) {
        Integer Iarr[] = {2,5,7,2,2,7,10};
        Student<Float> std1 = new Student<Float>(25.5f);
        std1.display();
        Student<String> std2 = new Student<String>("25");
        std2.display();
        Student<Integer> std3 = new Student<Integer>(25);
        std3.display();
    }
 }
 class Student<T>{
    T age;
    Student(T arr[]){

    }
    Student(T age){
       this.age = age;
    }
    public void display() {
       System.out.println("Value of age: "+this.age);
    }
 }