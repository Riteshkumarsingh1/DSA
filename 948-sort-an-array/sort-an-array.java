// class Solution {
//     public int[] sortArray(int[] nums) {
//         bubble(nums);
//         return nums;

//     }
//     static void bubble(int[] nums) {
//         boolean swapped;
//         for (int i = 0; i < nums.length; i++) {
//             swapped = false;
//             for (int j = 1; j < nums.length - i; j++) {
//                 if (nums[j] < nums[j - 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j - 1];
//                     nums[j - 1] = temp;
//                     swapped = true;
//                 }
//             }
//             if (!swapped) {
//                 break;
//             }
//         }
//     }
    
// }







//other solution BUBBLE SORT
class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length <= 1) return nums;

        int max = nums[0], min = nums[0];
        for( int num : nums) {
            if(num > max) max = num;
            if(num < min) min = num;
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for(int num : nums) {
            count[num - min]++;
        }

        int index = 0;
        for(int i = 0; i < range; i++){
            int freq = count[i];
            if(freq > 0){
                int value = i + min;
                while(freq-- > 0){
                    nums[index++] = value;
                }
            }
        }
        return nums;
    }
}






///ANOTHER SOLUTION USING SELECTION SORT
public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        selection(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}