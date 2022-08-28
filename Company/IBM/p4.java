public class p4 {
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 1, 0 } };
        int n = 3;
        int m = 4;
        solve(n, m, arr);
    }

    private static void solve(int n, int m, int[][] arr) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    if (arr[i][j - 1] == 1 || arr[i][j + 1] == 1 || arr[i + 1][j] == 1 || arr[i - 1][j] == 1) {
                        ans = ans + 1;
                        // System.out.println(arr[i][j]);
                    }
                }
            }
            // System.out.println();
        }
        System.out.println(ans);
    }
}
