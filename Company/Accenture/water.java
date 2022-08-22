import java.util.Arrays;

/* There are some glasses with equal capacity as 1 litre. The glasses are kept as follows: 
                   1
                 2   3
              4    5    6
            7    8    9   10
            
You can put water to the only top glass. If you put more than 1-litre water to 1st glass, 
water overflows and fills equally in both 2nd and 3rd glasses. 
Glass 5 will get water from both 2nd glass and 3rd glass and so on. 
If you have X litre of water and you put that water in a top glass, 
how much water will be contained by the jth glass in an ith row?
 */
public class water {
    public static void main(String[] args) {
        int i = 5;
        int j = 3;
        int x = 12;

        // geeksSolution(i, j, x);
        System.out.println("Amount of water in "+j+"th glass of "+i+"th row is : "+findWater(i,j,x));
    }

    static float findWater(int i, int j, float X) {
        if (j > i) {
            System.out.println("Incorrect Input");
            System.exit(0);
        }
        int ll = Math.round((i * (i + 1)));
        float[] glass = new float[ll + 2];

        int index = 0;
        glass[index] = X;

        for (int row = 1; row <= i; ++row) {
            for (int col = 1; col <= row; ++col, ++index) {
                X = glass[index];
                glass[index] = (X >= 1.0f) ? 1.0f : X;
                X = (X >= 1.0f) ? (X - 1) : 0.0f;
                glass[index + row] += X / 2;
                glass[index + row + 1] += X / 2;
                System.out.println(Arrays.toString(glass));
            }
        }

        return glass[(int) (i * (i - 1) /
                2 + j - 1)];
    }

}