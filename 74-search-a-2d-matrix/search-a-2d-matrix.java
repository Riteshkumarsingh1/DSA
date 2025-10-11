// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int low = 0;
//         int n = matrix.length;
//         int cols = matrix[0].length;
//         int high = n - 1;
//         while(low <= high) {
//     int mid = low + (high - low) / 2;
//     if (target >= matrix[mid][0] && target <= matrix[mid][cols - 1]) {
//         return binarySearch(target, matrix[mid]);
//     } else if (target < matrix[mid][0]) {
//         high = mid - 1;
//     } else {
//         low = mid + 1;
//     }
// }

//         return false;  
//     }

//     public boolean binarySearch(int[] arr, int target) {
//         int low = 0;
//         int high = arr.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) {
//                 return true;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return false;
//     }
// }






class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][matrix[0].length - 1]) {
                int l = 0;
                int r = matrix[i].length - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (matrix[i][m] == target) return true;
                    else if (matrix[i][m] < target) l = m + 1;
                    else r = m - 1;
                }
            }
        }
        return false;
    }
}
