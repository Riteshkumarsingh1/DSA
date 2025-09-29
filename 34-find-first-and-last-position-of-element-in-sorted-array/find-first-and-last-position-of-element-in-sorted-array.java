class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) {
            return new int[]{-1, -1};
        }
        int low = 0, high = nums.length - 1;
        int[] result = new int[2];

        // Find first occurrence
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (nums[low] != target) {
            return new int[]{-1, -1};
        }
        result[0] = low;

        // Find last occurrence
        high = nums.length - 1;
        while (low < high) {
            int mid = (low + high)/2 + 1; // Bias the mid to the right
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        result[1] = high;
        return result;
    }
}

