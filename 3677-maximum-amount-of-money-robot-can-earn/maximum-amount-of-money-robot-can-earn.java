class Solution {
    Integer[][][] dp;  // dp[row][col][neutralizations_left]
    
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        // Initialize 3D memo: row, col, remaining neutralizations (0-2)
        dp = new Integer[m][n][3];
        return maxCoins(coins, 0, 0, 2);
    }
    
    int maxCoins(int[][] coins, int r, int c, int neutLeft) {
        int m = coins.length, n = coins[0].length;
        
        // Out of bounds: invalid path
        if (r >= m || c >= n) return Integer.MIN_VALUE / 2;
        
        // Reached destination
        if (r == m - 1 && c == n - 1) {
            // Can neutralize robber here if available
            return neutLeft > 0 ? Math.max(0, coins[r][c]) : coins[r][c];
        }
        
        // Return memoized result
        if (dp[r][c][neutLeft] != null) {
            return dp[r][c][neutLeft];
        }
        
        int curr = coins[r][c];
        
        // Option 1: Take current cell value normally, move down/right
        int takeNormal = curr + Math.max(
            maxCoins(coins, r + 1, c, neutLeft),    // Down
            maxCoins(coins, r, c + 1, neutLeft)     // Right
        );
        
        int result = takeNormal;
        
        // Option 2: If negative cell + neutralization available, skip penalty
        if (curr < 0 && neutLeft > 0) {
            int skipPenalty = Math.max(
                maxCoins(coins, r + 1, c, neutLeft - 1),  // Down, neutralize here
                maxCoins(coins, r, c + 1, neutLeft - 1)   // Right, neutralize here
            );
            result = Math.max(takeNormal, skipPenalty);
        }
        
        // Memoize and return maximum
        return dp[r][c][neutLeft] = result;
    }
}