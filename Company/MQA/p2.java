/**
 * p2
 */
public class p2 {

    public static void main(String[] args) {
        int a[]={36,49,30,34,11,31,42,11,35,3};
        int[][] aa={{3,4,39}};
        System.out.println(solve(a,aa));
    }
    public static boolean set(int n, int k){
        if((n&(1<<(k-1)))>0) return true;
        else return false;
    }
    public static int solve(int[] A, int[][] B) {
        int max=0;
        int f=0;
        for(int i=0;i<B.length;i++){
            int x = B[i][0];
            int y = B[i][1];
            int z = B[i][2];
            int c=0;
            for(int j=x-1;j<A.length;j++){
                if(set(A[j],y)) {
                    c++;
                    A[j] = A[j]^z;
                }if(max<c) {
                    max=c;
                    c=0;
                }
            }
            f=f+max;
        }
        return f;
    }
}