// A simple Java program to find
// lexicographically minimum rotation
// of a given String
import java.util.*;

public class lex
{

	static String minLexRotation(String str)
	{
         System.out.println("Input = "+str);
		int n = str.length();

		String arr[] = new String[n];

		String concat = str + str;
        System.out.println("After concatination = "+concat);

		for (int i = 0; i < n; i++)
		{
            arr[i] = concat.substring(i, i + n);
            System.out.println(arr[i]);
		}

		Arrays.sort(arr);
        System.out.println("After sorting :  "+Arrays.toString(arr));
		return arr[0];
	}

	// Driver code
	public static void main(String[] args)
	{
		// System.out.println(minLexRotation("GEEKSFORGEEKS"));
		// System.out.println(minLexRotation("GEEKSQUIZ"));
      
		// System.out.println("Final Output = "+minLexRotation("babcbb"));
        myFun("GEEKSFORGEEKS");
	}

    static String myFun(String str ){
		String input = "babcbb";
        int len = str.length();
        String temp = str +str;
        String arr[] = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = temp.substring(i,i+len);
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
		return arr[0];
    }
}


