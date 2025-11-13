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
        boolean flg = false; 
        int oc = nums[0] == 1 ? 1 : 0; 
        int gc = nums[0], n = nums.length;

       
        for (int i = 1; i < n; i++) {
            gc = gcd(gc, nums[i]); 
            if (gcd(nums[i], nums[i - 1]) == 1) flg = true;
            if (nums[i] == 1) oc++; 
        }

        if (flg) return n - oc;
        if (gc != 1) return -1;
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            len = Math.min(len, gcdlen(nums, nums[i], i + 1));
        }

        return len + n - 2;
    }
}