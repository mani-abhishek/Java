/* 
 * 
 */
public class intro {
    public static void main(String[] args) {
        // 1-D Array
        System.out.println("welecome to Array"); 
        int a[] = new int[10];
        int b[];
        b = new int [1];
        int c[]={1,34,5,6};
        print1D(c);

        System.out.println(c[0]);

        // 2-D Array
        int z[][] = new int[1][3];
        // int y[][]={3,4,5,6,7,8,9,10,11};
        int y[][]={{3,4,5},{6,7,8},{9,10,11}};

        print2D(y);


    }
    public static void print2D(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void print1D(int a[]){
        for (int ele :a) {
            System.out.print(ele+", ");    
        }
    }
}
 