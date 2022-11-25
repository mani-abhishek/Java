import java.util.Arrays;

public class x2 {
    public static void main(String[] args) {
        int [][] saleRecord = {{100,198,333,323},
                                {122,232,221,111},
                                {223,565,245,764}
                        
                            };
        
        System.out.println(Arrays.toString(maxRevenue(saleRecord)));
    }

    public static int[] maxRevenue(int[][] saleRecord) {
        int max [] =new int[saleRecord.length];
        int c=0;
        for (int i = 0; i < saleRecord.length; i++) {
            
            for (int j = 0; j < saleRecord[i].length; j++) {
                if(saleRecord[i][j]>c) c=saleRecord[i][j];
            }
            max[i]= c;
            c=0;
        }
        
        return max;
    }
}
