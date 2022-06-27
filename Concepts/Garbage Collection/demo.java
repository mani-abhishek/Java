public class demo{
    public static void main(String[] args) {
        Student a = new Student("Abhi");
        Student b = new Student("Abhis");
        Student c = new Student("Abhish");
        a.show();
        b.show();
        c.show();
        a.getNextId();
        b.getNextId();
        c.getNextId();
        {
            Student x = new Student("Vicky");
            Student y = new Student("Vicky1");
            x.show();
            y.show();
            x.getNextId();
            y.getNextId();
            x=y=null;
            System.gc();
            System.runFinalization();
        }
        a.getNextId();
    }
}

class Student {
    int id;
    String name;
    static int nextId=1;
    Student(String name){
        this.name = name;
        this.id = nextId++;
        // System.out.println(this.id);
    }
    public void getNextId(){
        System.out.println("Next Id  = "+nextId);
    }
    public void show(){
        System.out.println("Id = "+id+" Name = "+name);
    }
}