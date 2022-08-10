import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        // int size = Integer.parseInt(br.readLine());
        // String word = br.readLine();
        // String sen[] = new String[size];
        String line;
        int i=0;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        // System.out.println(Arrays.toString(sen));

    }
}