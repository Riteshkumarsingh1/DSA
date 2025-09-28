class Solution {
    public int[] twoSum(int[] nums, int target) {
     //brut force approach

    //  for (int i =0; i< nums.length - 1 ; i++){
    //     for (int j=i+1; j< nums.length; j++){
    //         if (nums[i] + nums[j] == target){
    //             return new int[]{i,j};
    //         }
    //     }
    //  }   
    //  return new int []{};



    //using HashMap:::::::

    HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
    for(int i =0; i<nums.length; i++){   // iterate over arr
        if(map.containsKey(nums[i])){    // check for key like here 9-2=7 , so 7 is a key here
            return new int []    {map.get(nums[i]),i};    //create new arr  map={key,value}
        }else{
            map.put(target-nums[i],i);  // else put map={key,i};
        }
    }
    return new int [ ]{};
    }
}