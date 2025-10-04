class Solution {
    public int findPeakElement(int[] nums) {
       
      // linear search method

          // using while loop
    //   int i=0;
    //   while(arr[i]<arr[i+1]){
    //     i++;
    //   }   
    //   return i;

      // using for loop
    //   for(int i =0; i< arr.length;i++){
    //     if (arr[i]>arr[i+1]){
    //         return i;
    //     }
    //   }
    //   return -1;



    //bimary search method:::::
    int low =0, high=nums.length-1;
    while(low<high){
        int mid = low+(high-low)/2;
        if(nums[mid]<nums[mid+1]){
            low=mid+1;
        }else{
            high=mid;
        }
    }
    return low;
    }
}
    
