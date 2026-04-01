// class Solution {
//     public int numRollsToTarget(int n, int k, int target) {
//         return dice(n, k, target);
//     }
    
//     int dice(int n, int k, int target) {
//         if (n == 0 && target == 0) return 1;  
//         if (n == 0 || target < 0) return 0;   
        
//         int ways = 0;
        
//         for (int i = 1; i <= k && i <= target; i++) {
//             ways = (ways + dice(n - 1, k, target - i)) % 1000000007;
//         }
//         return ways;
//     }
// }   


//  TLE aayega isse so memoizeit .....


class Solution {
    Integer[][] dp;
    
    public int numRollsToTarget(int n, int k, int target) {
        dp = new Integer[n+1][target+1];
        return dice(n, k, target);
    }
    
    int dice(int n, int k, int target) {
        if (n == 0 && target == 0) return 1;
        if (n == 0 || target < 0) return 0;
        
        if (dp[n][target] != null) return dp[n][target];
        
        int ways = 0;
        for (int i = 1; i <= k && i <= target; i++) {
            ways = (ways + dice(n-1, k, target-i)) % 1000000007;
        }
        return dp[n][target] = ways;
    }
}