/*  "Abstract means difining method without difining method so that any other can define the meto"
    1.  we can not create object of abstract class
    2. abstract class may or may not have abstract method.
    3. abstract method must have abstract class.
*/
public class demo{
    public static void main(String[] args) {
        // we cant create object of feature class
        // feature obj = new feature();
        
    }
}

abstract class feature {
    public void feature1(){
        
    }
    public abstract void feature2();
    public abstract void feature3();
    public abstract void feature4();
}

class A extends feature{

}