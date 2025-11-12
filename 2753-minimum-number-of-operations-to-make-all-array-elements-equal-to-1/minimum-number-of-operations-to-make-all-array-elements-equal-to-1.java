class Solution {
    private int gcdlen(int[] nums, int a, int i) {
        if (a == 1) return 1; 
        if (i == nums.length) return Integer.MAX_VALUE - nums.length;
        return 1 + gcdlen(nums, gcd(a, nums[i]), i + 1); 
    }

    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int minOperations(int[] nums) {
        boolean flg = false; // Flag if any adjacent pair has GCD = 1
        int oc = nums[0] == 1 ? 1 : 0; // Count of 1s
        int gc = nums[0], n = nums.length;

        // Step 1: Check if we already have any 1s or pairs with GCD=1
        for (int i = 1; i < n; i++) {
            gc = gcd(gc, nums[i]); // Update overall GCD
            if (gcd(nums[i], nums[i - 1]) == 1) flg = true; // Check adjacent pair
            if (nums[i] == 1) oc++; // Count ones
        }

        // If we already can form GCD=1 from pairs or existing ones
        if (flg) return n - oc;

        // If global GCD != 1, impossible to make all 1s
        if (gc != 1) return -1;

        // Step 2: Find shortest subarray with GCD=1
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            len = Math.min(len, gcdlen(nums, nums[i], i + 1));
        }

        // Step 3: Add operations to spread ones to all positions
        return len + n - 2;
    }
}