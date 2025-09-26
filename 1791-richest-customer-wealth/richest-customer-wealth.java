class Solution {
    public int maximumWealth(int[][] accounts) {
         // person = row
        // accounts = cols
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < person.length; account++) {
                sum = sum + person[account];
            }
            // now we have the sum of accounts of person
            // compare it with the max

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}