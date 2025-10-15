// import java.util.List;
// import java.util.ArrayList;

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             int index = Math.abs(nums[i]) - 1;
//             if (nums[index] > 0) {
//                 nums[index] = -nums[index];
//             }
//         }
        
//         List<Integer> result = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 result.add(i + 1);
//             }
//         }
//         return result;
//     }
// }



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int index = Math.abs(nums[i]);
            nums[index - 1] = - Math.abs(nums[index - 1]);
        }
        for(int i = 1 ; i <= nums.length ;i++)
            if(nums[i -1] > 0) res.add(i);
        
        return res;
    }
}