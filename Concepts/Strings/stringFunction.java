
public class stringFunction {
    public static void main(String[] args) {

        demoOnString demo = new demoOnString();
        // Demonstraton on substring means dividing string into multiple string
        String forsSubstring = "Abhishek Mani";
        // demo.substring(forsSubstring);

        // demo.stringToCharArray(forsSubstring);

        demo.basicOperation();

        // demo.valueOfMethod();

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
    public void basicOperation(){
        String str = "Abhishek Mani";
        String str1 = "Vicky";
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
        //Returns the value of a String object
        System.out.println(str.toString());
        //Return the Unicode of the first character in a string (the Unicode value of "H" is 72)
        System.out.println(str.codePointAt(1));

        System.out.println(str.codePoints());

        System.out.println(str.codePointBefore(1));

        System.out.println(str.codePointCount(1, 4));

        System.out.println(str1.compareTo(str));

        System.out.println(str.compareToIgnoreCase(str1));

        System.out.println(str.concat(str1));

        System.out.println(str.contains("Mani"));

        System.out.println(str.contentEquals("Abhishek Mani"));

        System.out.println((str.endsWith("ani")));
        // match exactly 
        System.out.println(str.equals(str1));
        // match the string ingnorinng case
        System.out.println(str.equalsIgnoreCase(str1));

        System.out.println(str.hashCode());



       
    }
    public void valueOfMethod(){
        boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'};  
        demoOnString obj=new demoOnString();  
        System.out.println(String.valueOf(b1));    
        System.out.println(String.valueOf(b2));    
        System.out.println(String.valueOf(sh));    
        System.out.println(String.valueOf(i));    
        System.out.println(String.valueOf(l));    
        System.out.println(String.valueOf(f));    
        System.out.println(String.valueOf(d));    
        System.out.println(String.valueOf(chr));    
        System.out.println(String.valueOf(obj));    
        
    }
}