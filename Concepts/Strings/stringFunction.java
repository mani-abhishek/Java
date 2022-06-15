
public class stringFunction {
    public static void main(String[] args) {

        demoOnString demo = new demoOnString();
        // Demonstraton on substring means dividing string into multiple string
        String forsSubstring = "Abhishek Mani";
        demo.substring(forsSubstring);

        demo.stringToCharArray(forsSubstring);

        demo.basicOperation(forsSubstring);
    }
}

class demoOnString{

    public void substring(String str){
        System.out.println(str);
        // String contain 0th index to (8-1)th index which is "Abhishek".
        String sub = str.substring(0,8);
        System.out.println(sub);
        // 4th index to last
        sub = str.substring(4);
        System.out.println(sub);
        // this will print empty string becasue 0 to 0 
        System.out.println(str.substring(0,0));

    }
    public void stringToCharArray(String str){
        // toCharArray function will convert string into char array and store into intialized array.
        char arr [] = str.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        } 
    }
    public void basicOperation(String str){
        // convert into Lower Case
        System.out.println(str.toLowerCase());
        // converrt into Upper Case
        System.out.println(str.toUpperCase()); 
        // find character at given index
        System.out.println(str.charAt(0)); //A
        // remove spaces at first and last
        System.out.println("  Camp ".trim()); //camp
        // find exact string and return index of first character otherwise -1.
        System.out.println(str.indexOf("Mani")); //9
        System.out.println(str.indexOf('m')); //-1
        System.out.println(str.indexOf('a', 6)); // 10
        System.out.println(str.indexOf("shek", 1)); //4
        System.out.println(str.length());
        System.out.println();
    }
}