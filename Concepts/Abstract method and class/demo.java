/*  "Abstract means difining method without difining method so that any other can define the method by extendind the class"
    1.  we can not create object of abstract class
    2. abstract class may or may not have abstract method.
    3. abstract method must have abstract class.
*/
public class demo{
    public static void main(String[] args) {
        // we cant create object of feature class
        // feature obj = new feature();
        B b1 = new B();
        b1.feature1();
        b1.feature2();
        b1.feature3();
        b1.feature4();
    }
}

abstract class feature {
    public void feature1(){
        System.out.println("feature 1");
    }
    public abstract void feature2();
    public abstract void feature3();
    public abstract void feature4();
}
// we also can not create object of this class
abstract class A extends feature{
    public void feature2(){
        System.out.println("feature 2");
    }
}
// Now we can create object class B
class B extends A{
    public void feature3(){
        System.out.println("feature 3");
    }
    public void feature4(){
        System.out.println("feature 4");
    }
}