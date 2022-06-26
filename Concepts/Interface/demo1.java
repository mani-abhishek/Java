


public class demo1{
    public static void main(String[] args) {
        A a = new A(){
            public void show(){
                System.out.println("by creating anonymous object");
            }
        };
        a.show();
                    // OR 
        A b = ()-> System.out.println("This is an examplle of lamda which is introduced in java 8");
        b.show();
                    // OR
        // we can implements interface with new class and difine method there and use by creating reference/object of that class. //in demo.java//
    }
}


interface A{
    void show();
}



