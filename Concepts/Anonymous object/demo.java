public class demo{
    public static void main(String[] args) {
        // this is way through which we can create object and assing into refrence variable
        // it create a space in stack as well as heap. 
        Book book1 = new Book(1000,"Java");
        book1.show();
        // In this scenerio we are crating anonymous object of "Book" class and calling show() method;
        // it will create only space in heap not in satck;
        new Book(2000,"Python").show();

        new Book().price = 10;
        new Book().bookName = "C++";
        // here we getting null value because whenever we write "new Book()" then new space and anonymous object will be create in Heap
        new Book().show();

        // Conclusion :  
        // - when we are going to call only one time method of class then use anonymous object, but when we are going to use multiple 
        // times then use reference object/ variable 
        // -- when we create anonymous class then, spcae will be clean in Heap by Garbage collector because it not pointing to any reference but
        // in case of reference object it point to reference variable in stack.
    }
}
class Book{
    int price;
    String bookName;

    Book(){};

    Book(int price, String bookName ){
        this.bookName=bookName;
        this.price  = price;
    }
    
    public void show(){
        System.out.println("Book Name = "+bookName+"\nPrice = "+price);
    }
}