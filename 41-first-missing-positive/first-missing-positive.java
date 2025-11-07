class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int small=1;
        for(int val:nums){
            if(val==small){
                small++;
            }
        }
        return small;
    }
}