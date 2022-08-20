import java.util.Arrays;

public class circularTraversal {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        // output 1,2,3,4,5,10,15,14,13,12,11,6,7,8,9
        int r = 4;
        int c = 5;
        printList(arr);
        solve(arr,r,c);
        solution(arr,r,c);
    }
    private static void solution(int[][] arr, int r, int c) {
        int i,rowStart=0,rowEnd=r,colStart = 0,colEnd=c;
        while(rowStart<rowEnd&&colStart<colEnd){
            for(i=colStart;i<colEnd;++i){
                System.out.print(arr[rowStart][i]+",");
            }rowStart++;
            for(i=rowStart;i<rowEnd;i++){
                System.out.print(arr[i][colEnd-1]+",");
            }colEnd--;
            if( )
        }

    
    }
    private static void solve(int[][] arr, int r, int c) {
        int i=0,j=0,x=1,y=0,k=0;
        int l = r*c;
        while(k<l){
            while(k<l&&j<c){
                System.out.print(arr[i][j++]+",");
                k++;
            }
            i = i+1;
            j = j-1; 
            c=c-1;
            while(k<l&&i<r){
                System.out.print(arr[i++][j]+",");
                k++;
            }
            // System.out.println(i+"-"+j);
            i=i-1;
            j= j-1;
            r=r-1;
            while(k<l&&j>=y){
                System.out.print(arr[i][j--]+",");
                k++;
            }
            y=y+1;
            i=i-1;
            j=j+1;
            while(k<l&&i>=x){
                System.out.print(arr[i--][j]+",");
                k++;
            }
            x=x+1;
            i=i+1;
            j=j+1;
        }
    }
    private static void printList(int arr[][]){
        for(int a[]:arr)
        System.out.println(Arrays.toString(a));
    }
}