class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);          // ✅ wrapper
    }
    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;               // ✅ base case
        }
        if (num % 2 == 0) {
            return helper(num/2, steps+1);   // ✅ even → divide by 2
        }
        return helper(num-1, steps+1);       // ✅ odd → subtract 1
    }
}