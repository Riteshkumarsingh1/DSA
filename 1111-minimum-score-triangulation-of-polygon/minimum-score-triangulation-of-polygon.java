// class Solution {
//     public int minScoreTriangulation(int[] values){
//          int n= values.length;     //Stores the length of the input array, i.e., the number of vertices in the polygon.
//          return helper(values,0,n-1);  //Starts a recursive process to find the minimum triangulation score by calling helper with the indices covering the entire polygon: from vertex 0 to vertex n-1.
//     }
//     private int helper(int[] values, int i, int j){ //A helper recursive function that computes the minimum score to triangulate the polygon formed by vertices from index i to j.
//     if (i+1== j){     // Base case: if the sub-polygon has only two vertices (adjacent vertices), no triangle can be formed, so the score is 0.
//         return 0;
//     }
//     int ans =Integer.MAX_VALUE;//Initializes a variable ans to a very large value to keep track of the minimum score found.
//     for(int k = i+1; k<j ; k++){  //Loops through all possible vertices k between i and j to try forming a triangle (i, k, j).
//         ans = Math.min(ans,values[i]*values[j]*values[k]+helper(values,i,k)+ helper(values,k,j));
//                            //calculatr pdt of ijk    //Recursively computes the minimum score of triangulating the sub-polygon from i to k. and then k to j
//     }
//     return ans;
 
//    }
// }









// class Solution {
//     public int minScoreTriangulation(int[] values) {
//         int n = values.length;
//         int[][] dp = new int[n][n];
        
//         for (int len = 3; len <= n; len++) {
//             for (int i = 0; i + len - 1 < n; i++) {
//                 int j = i + len - 1;
//                 int best = Integer.MAX_VALUE;
//                 for (int k = i + 1; k < j; k++) {
//                     int cost = dp[i][k] + dp[k][j] + values[i] * values[k] * values[j];
//                     if (cost < best) best = cost;
//                 }
//                 dp[i][j] = best;
//             }
//         }
//         return n == 0 ? 0 : dp[0][n-1];
//     }
// }






















class Solution {
    int [][]dp;
    public int minScoreTriangulation(int[] values) {
        dp = new int[values.length][values.length];
        return helper(values, 0, values.length-1);
    }
    int helper(int []a, int i, int j){
        if(j - i < 2){
            return 0;
        }
        if(dp[i][j] != 0)
        return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k = i+1 ; k < j ; k++){
            int cost = a[i]*a[k]*a[j] + helper(a,i,k)+helper(a,k,j);
            min = Math.min(min, cost);
        }
        return dp[i][j] = min;
    }
}