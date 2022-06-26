/*
 *  As we know that java does not support multiple inheritance because of Diamond problem but we can achieve this by implementiing interface.
*/

public class demo3 {
    public static void main(String[] args) {
        A obj = new A();
        // This is happen because in jave class have more priority than interface that's why class B method were invoked. This is called Third rule
        obj.show(); // output : Class B
    }
}


class B implements X,Y{
    public void show(){
        System.out.println("Class B");
    }

}

interface X{
    default void show(){
        System.out.println("interface B");
    }

}

interface Y{
    default void show(){
        System.out.println("Interface B");
    }

}


// if class B, interface X and Y have same method then Class B method have more priority.
class A extends B implements X,Y{

}


