/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        singleton o = singleton.getInstance();
        o.show();
        
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