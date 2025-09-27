class Solution {
    public boolean containsDuplicate(int[] nums) {
    //BRUT force Approach::::::::::::::


    //  for(int i=0; i< nums.length; i++){
    //     for(int j= i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             return true;
    //         }
    //     }
    //  }   
    //  return false;


    //Sorted technique::::::::::

    // Arrays.sort(nums);
    // for (int i=0;i<nums.length-1; i++){
    //     if(nums[i]==nums[i+1]){
    //       return true;
    //     }
    // }
    // return false;



    // ARRAYLIST or HashSet method::::::::

    HashSet<Integer> numbers = new HashSet<>();
    for (int i=0; i< nums.length; i++){
        if(numbers.contains(nums[i]))
        return true;
        numbers.add(nums[i]);
    }
    return false;
    }
}