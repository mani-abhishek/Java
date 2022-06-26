public class demo{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            A a = new A(i);
            a.run();
        }
    }
}

class A implements Runnable{
    int i;
    A(int i){
        this.i = i;
    }
    public void run(){
        System.out.println(Thread.currentThread().getId()+i);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
}