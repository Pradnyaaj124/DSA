class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // -1 means not calculated yet
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return paths(0, 0, m, n, dp);
    }

    public int paths(int i, int j, int m, int n, int[][] dp) {

        // Reached bottom-right
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Outside grid
        if (i == m || j == n) {
            return 0;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Move down
        int w1 = paths(i + 1, j, m, n, dp);

        // Move right
        int w2 = paths(i, j + 1, m, n, dp);

        // Store result
        dp[i][j] = w1 + w2;

        return dp[i][j];
    }
}