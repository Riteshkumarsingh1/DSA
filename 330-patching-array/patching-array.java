// class Solution {
//     public int minPatches(int[] nums, int n) {
//         long sumFormed =0;
//         long expectedSum = 1;
//         int minPatches = 0;
//         int i= 0;
//         int m = nums.length;
//         while(sumFormed<n){
//             if(sumFormed>= expectedSum){
//                 expectedSum++;
//             }else{
//                 if(i<m  && nums[i]<= expectedSum){
//                     sumFormed += nums[i];
//                     i++;
//                 }else{
//                     minPatches++;
//                     sumFormed += expectedSum;
//                 }
//             }
//         }
//         return minPatches;
        
//     }
// }






///Optimal Solution::::::::::::::

class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int patches = 0, i = 0;
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
            } else {
                patches++;
                miss += miss;
            }
        }
        return patches;
    }
}
