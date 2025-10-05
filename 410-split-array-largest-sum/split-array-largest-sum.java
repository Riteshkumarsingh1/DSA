// class Solution {
//     public int splitArray(int[] nums, int k) {
        
    
//         int start = 0;
//         int end = 0;
//         for (int i = 0; i < nums.length; i++) { 
//             start = Math.max(start, nums[i]);    
//             end += nums[i];
//         }

        
//         while (start < end) {
//             int mid = start + (end - start) / 2;
        
//             int sum = 0;
//             int pieces = 1;
//             for (int num : nums) {
//                 if (sum + num > mid) {
                
//                     sum = num;
//                     pieces++;
//                 } else {
//                     sum += num;
//                 }
//             }
//             if (pieces > k) {
//                 start = mid + 1;
//             } else {
//                 end = mid;
//             }
//         }
//         return end;
//     }
// }





//OTHER SOLUTION OF IT::::::::::::::



class Solution {
    public int canIGive(int[] arr,int k,int value){
        boolean canWe=false;
        int counter=arr[0];
        int painters=1;
        for(int i=1;i<arr.length;i++){
            if(counter +arr[i] <=value){
                counter+=arr[i];
            }
            else{
                painters++;
                counter=arr[i];
            }
        }
        return painters;
    }
    public int splitArray(int[] nums, int k) {
        int low=nums[0];
        int high=0;
        for(int i=0;i<nums.length;i++){
            low = Math.max(low, nums[i]);
            high+=nums[i];
        }
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;
            int isPossible=canIGive(nums,k,mid);
            if(isPossible<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}