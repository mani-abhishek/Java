
public class stringFunction {
    public static void main(String[] args) {

        demoOnString demo = new demoOnString();
        // Demonstraton on substring means dividing string into multiple string
        String forsSubstring = "Abhishek Mani";
        demo.substring(forsSubstring);


    }
}

class demoOnString{

    public void substring(String str){
        System.out.println(str);
        // String contain 0th index to 8th which is "Abhishek".
        String sub = str.substring(0,8);
        System.out.println(sub);
        // 4th index to last
        sub = str.substring(4);
        System.out.println(sub);

    }
}