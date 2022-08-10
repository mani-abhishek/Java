import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) throws IOException {
        
        // createFile();
        // writeInFile();
        // readFileUsingScanner();
        // deleteFile();
       
    }

   private static void deleteFile() {
        File myFile = new File("myFile.txt");
        if(myFile.delete()) System.out.println("File deleted Sucessfully" + myFile.getName());
        else System.out.println("There is some proble occured while deleting "+myFile.getName()+" File");
    }

 private static void readFileUsingScanner() throws FileNotFoundException {
        File myFile = new File("myFile.txt");
        Scanner sc = new Scanner(myFile);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }

    private static void writeInFile() throws IOException {
        /* 
         * .write() function : it will overide if same string present in file for example you can run this method mutiple times but
         * you will find no change in file.
         */
        FileWriter fWriter  = new FileWriter("myFile.txt");
        fWriter.write("Just randtom text to check whether file is created or not!\n");
        fWriter.write("Just randtom text to check whether file is created or not!");//create duplicate string
        fWriter.close();
    }

    private static void createFile() throws IOException {
        File myFile = new File("myFile.txt");
        if(myFile.createNewFile()) System.out.println("File Create Sucessfully");
        
    }
    
}