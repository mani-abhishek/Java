public class basic {
    public static void main(String[] args) {
        System.out.print("abhi");
        // System.out.println();
        // System.out.print("\b\b"); // Prints a backspace
        for(int i = 0; i < 80*300; i++) // Default Height of cmd is 300 and Default width is 80
           System.out.print("\b"); // Prints a backspace
           System.out.print("dddfgdfgs");
    }
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     
     }
}
