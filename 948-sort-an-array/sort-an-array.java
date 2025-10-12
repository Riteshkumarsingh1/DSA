
//other solution  using Bubble sort


// class Solution {
//     public int[] sortArray(int[] nums) {
//         if(nums == null || nums.length <= 1) return nums;

//         int max = nums[0], min = nums[0];
//         for( int num : nums) {
//             if(num > max) max = num;
//             if(num < min) min = num;
//         }

//         int range = max - min + 1;
//         int[] count = new int[range];

//         for(int num : nums) {
//             count[num - min]++;
//         }

//         int index = 0;
//         for(int i = 0; i < range; i++){
//             int freq = count[i];
//             if(freq > 0){
//                 int value = i + min;
//                 while(freq-- > 0){
//                     nums[index++] = value;
//                 }
//             }
//         }
//         return nums;
//     }
// }







//another solution using Selection Sort

class Solution {
    public int[] sortArray(int[] nums) {
        java.util.Arrays.sort(nums);
        return nums;
    }



    static void selection(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

}
