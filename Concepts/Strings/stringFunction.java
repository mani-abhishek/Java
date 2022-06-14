
public class stringFunction {
    public static void main(String[] args) {

        demoOnString demo = new demoOnString();

        String forsSubstring = "Abhishek Mani";
        demo.substring(forsSubstring);


    }
}

class demoOnString{

    public void substring(String str){
        System.out.println(str);
        String sub = str.substring(0,8);
        System.out.println(sub);
        sub = str.substring(4);
        System.out.println(sub);

    }
}