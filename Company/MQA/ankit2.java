import java.util.HashSet;

public class ankit2 {
    public static void main(String[] args) {
        String s="comiccomedy";
        System.out.println(nonRepeatedChar(s));
    }

    public static int nonRepeatedChar(String compString) {
        int c=0;
        for (int i = 0; i < compString.length(); i++)
        {
            int flag = 0;
            for (int j = 0; j < compString.length(); j++)
            {
                if (compString.charAt(i) == compString.charAt(j) && i != j)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                c++;
        }

        return c;

    
    }
}
