/*
 * As we know that interface only contains abstract method but 
 * in java 8, we can also define the method inside interface by using 1. default 2. static
 */
public class demo2 {
    public static void main(String[] args) {
        M m = new M(){
            public void show(){ // abstract method 1
                System.out.println("Show method");
            }
            public void show1(){ // abstract method 2

            }
        };
        m.display();
        m.show();

        // M mm = ( )-> System.out.println("lamda"); // if only one abstract method were declared in interface
        // mm.show();
        // mm.display();

        
        M.add();// static method, we can invoke by class interface name easily
        M.view();// static method, we can invoke by class interface name easily
    }
}

interface M{
    void show(); //abstract method
    void show1(); //abstract method
    // defining method inside the interface using default keyword.
    default void display(){
        System.out.println("display method");
    }
     // defining method inside the interface using static keyword.
    static void view(){
        System.out.println("view method");
    }
     // defining method inside the interface using static keyword.
    public static void add(){
        System.out.println("Add method");
    }
}
