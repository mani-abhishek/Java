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
        // A row number i has maximum i
        // columns. So input column
        // number must be less than i
        if (j > i) {
            System.out.println("Incorrect Input");
            System.exit(0);
        }

        // There will be i*(i+1)/2 glasses
        // till ith row (including ith row)
        int ll = Math.round((i * (i + 1)));
        float[] glass = new float[ll + 2];

        // Put all water in first glass
        int index = 0;
        glass[index] = X;

        // Now let the water flow to the
        // downward glasses till the row
        // number is less than or/ equal
        // to i (given row)
        // correction : X can be zero for side
        // glasses as they have lower rate to fill
        for (int row = 1; row <= i; ++row) {
            // Fill glasses in a given row. Number of
            // columns in a row is equal to row number
            for (int col = 1; col <= row; ++col, ++index) {
                // Get the water from current glass
                X = glass[index];

                // Keep the amount less than or
                // equal to capacity in current glass
                glass[index] = (X >= 1.0f) ? 1.0f : X;

                // Get the remaining amount
                X = (X >= 1.0f) ? (X - 1) : 0.0f;

                // Distribute the remaining amount
                // to the down two glasses
                glass[index + row] += X / 2;
                glass[index + row + 1] += X / 2;
            }
        }

        // The index of jth glass in ith
        // row will be i*(i-1)/2 + j - 1
        return glass[(int) (i * (i - 1) /
                2 + j - 1)];
    }

}