/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        singleton o = singleton.getInstance();
        singleton o1 = singleton.getInstance();
        o.show();
        System.out.println(o.hashCode());
        System.out.println(o1.hashCode());
        
    }
}
class singleton{
    static singleton obj = new singleton();

    public static singleton getInstance(){
        return obj;
    } 
    public void show(){
        System.out.println("invoked");
    }
}