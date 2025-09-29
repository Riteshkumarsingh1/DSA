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














class Solution {
    public int minScoreTriangulation(int[] polygonValues) {
        int vertexCount = polygonValues.length;
        int[][] minScore = new int[vertexCount][vertexCount];

        for (int gap = 2; gap < vertexCount; gap++) {
            for (int start = 0; start + gap < vertexCount; start++) {
                int end = start + gap;
                int currentMinScore = Integer.MAX_VALUE;

                for (int mid = start + 1; mid < end; mid++) {
                    int triangleScore = minScore[start][mid] 
                        + minScore[mid][end] 
                        + polygonValues[start] * polygonValues[mid] * polygonValues[end];
                    currentMinScore = Math.min(currentMinScore, triangleScore);
                }
                minScore[start][end] = currentMinScore;
            }
        }
        return minScore[0][vertexCount - 1];
    }

   
}