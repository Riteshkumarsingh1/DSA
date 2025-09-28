class Solution {
    public int largestPerimeter(int[] nums) {
     Arrays.sort(nums);   // arrays got sorted here

     int n= nums.length;  // stores size of array

     for(int i=n-1; i>=2; i--){    // start loop from last element of sorted array (largest)  and moves backward towerds (lowest). This way, you're always considering the three largest possible values at each step

        if ((nums[i-1]+ nums[i-2])> nums[i]){   //Checks the triangle inequality for three consecutive elements:
//The sum of the two smaller sides (nums[i-1] and nums[i-2]) must be greater than the largest side (nums[i]).
//This is the only condition needed for a valid triangle when the array is sorted

            return nums[i]+ nums [i-1] + nums [i-2] ;  //If the above condition is true, it means these three numbers can form a triangle.
//Returns the perimeter (sum of all three sides) of this triangle, which will be the largest possible because the array was sorted and we checked the biggest numbers first


                   }
     }   
     return 0;  //After checking all possible combinations, if no valid triangle was found, returns 0 (the problem statement requires this return for no valid triangle)
    }
}