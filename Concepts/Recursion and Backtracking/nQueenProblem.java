import java.util.Arrays;

/**
 * nQueenProblem
 * On an 8x8 chessboard place 8 queens in such a way that they are not on the attacking side of each other
 */
public class nQueenProblem {

    public static void main(String[] args) {
        int n = 8;
        char [][] q = new char [n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(q[i], '-');
        }
        nQueen(q, 0);
        
    }
    public static void nQueen(char mat[][],int r){
        if(r==mat.length){
            printSolution(mat);
            return;
        }
        for (int i = 0; i < mat.length; i++) {
            if(isSafe(mat,r,i)){
                mat[r][i]='Q';
                nQueen(mat, r+1);
                
                mat[r][i] = '-';//back-tracking
            }
        }
    }
    private static boolean isSafe(char[][] mat, int r, int c) {
        for (int j = 0; j < r; j++) {
            if(mat[j][c]=='Q') return false;
        }
        for (int i = r,j=c; i >=0 && j<mat.length; i--,j++) {
            if(mat[i][j]=='Q') return false;
        }
        for (int i = r,j=c; i >=0 && j>=0; i--,j--) {
            if(mat[i][j]=='Q') return false;
        }
        return true;
    }
    private static void printSolution(char[][] mat) {
        for (char[] ch : mat) {
            System.out.println(Arrays.toString(ch).replaceAll(",", ""));
        }
        System.out.println();
    }
    
}