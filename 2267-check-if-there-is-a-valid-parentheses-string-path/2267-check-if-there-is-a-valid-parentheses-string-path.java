class Solution {
    int m, n;
    char[][] grid;
    Boolean[][][] dp;

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        // Total path length must be even
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        dp = new Boolean[m][n][m + n];

        return dfs(0, 0, 0);
    }

    private boolean dfs(int row, int col, int balance) {

        // Update balance
        if (grid[row][col] == '(') {
            balance++;
        } else {
            balance--;
        }

        // Invalid prefix
        if (balance < 0) {
            return false;
        }

        // Destination
        if (row == m - 1 && col == n - 1) {
            return balance == 0;
        }

        // Already calculated
        if (dp[row][col][balance] != null) {
            return dp[row][col][balance];
        }

        boolean result = false;

        // Move down
        if (row + 1 < m) {
            result = dfs(row + 1, col, balance);
        }

        // Move right
        if (!result && col + 1 < n) {
            result = dfs(row, col + 1, balance);
        }

        return dp[row][col][balance] = result;
    }
}