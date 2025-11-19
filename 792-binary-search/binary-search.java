// public class binarySearch {
//     public static void main(String[] args) { 
//         int [] arr = {2,4,6,8,10,12,14,16,18,20};
//         int target = 14;
//         System.out.println(search(arr, target, 0, arr.length - 1));
//     }
//       static int search(int [] arr, int target, int start , int end) {  
//         if(start > end){
       
//         return -1;  
//        }
//        int middle = start + (end - start)/2;
//        if(arr[middle] == target){
        
//         return middle;
//        }
//        else if(arr[middle] < target){
//        return search(arr, target, middle + 1, end);
//        }
//        else{
//        return search(arr, target, start, middle - 1);
//        }
//     }
// }










class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] < target)
            return binarySearch(nums, target, mid + 1, end);
        else
            return binarySearch(nums, target, start, mid - 1);
    }
}
