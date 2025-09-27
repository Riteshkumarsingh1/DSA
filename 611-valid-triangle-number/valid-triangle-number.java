// import java.util.Arrays;

// class Solution {
//     public int triangleNumber(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length, ans = 0;
//         for (int k = n - 1; k >= 2; --k) {          // k is the largest side
//             int i = 0, j = k - 1;
//             while (i < j) {
//                 if (nums[i] + nums[j] > nums[k]) {
//                     ans += j - i;
//                     j--;
//                 } else {
//                     i++;
//                 }
//             }
//         }
//         return ans;
//     }
// }



import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += j - i;
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}

