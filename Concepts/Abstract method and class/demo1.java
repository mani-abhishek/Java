public class demo1 {
    public static void main(String[] args) {
        // Phone p = new Phone();
        Iphone i = new Iphone();
        Android a = new Android();
        show(i);
        show(a);
    }
    public static void show(Phone obj){
        obj.showDetails();
    }
    
}

// class Phone{
abstract class Phone{
    // public void showDetails(){   }
    public abstract void showDetails();
}

class Iphone extends Phone{
    public void showDetails(){
        System.out.println("This is an Iphone");
    }
}

class Android extends Phone{
    public void showDetails(){
        System.out.println("This is an Android Phone");
    }
}
