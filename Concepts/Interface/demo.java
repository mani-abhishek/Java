/* 
 * types of interface : 1. SAM(Single abstract method) or functional interface which means only one method declare in interface. ex: runnable
 *                      2. Marker interface which means interface does not contain any method inside. ex: serilizable,remote,cloneable
 * 
 * 
*/


public class demo{
    public static void main(String[] args) {
        A  a = new Z ();
        a.show();

        B b = new Z();
        b.display();

        Z z = new Z();
        z.show();
        z.display();

        // A a = ()->
        //         System.out.println("inside main class");
            
        // a.show();

    }
}
// This is Marker interface
interface C{

}
// This is functional interface
interface A{
    // by default when we write "void method()" then internaly it is "public abstract void method()"
    void show();
}
interface B{
    void display();
}

class Z implements A,B{
    public void show(){
        System.out.println("A");
    }
    public void display(){
        System.out.println("B");
    }
}



