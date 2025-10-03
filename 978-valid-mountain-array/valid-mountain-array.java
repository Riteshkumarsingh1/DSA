class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean down = false;
        boolean up = false;
        for(int num = 1; num<arr.length; num++)
        {
            if(arr[num] > arr[num-1] && down == false)
            {
                up = true;
                continue;
            }
            else if(arr[num] == arr[num-1]) return false;
            if(arr[num] < arr[num-1]) down = true;
            else if(arr[num] == arr[num-1]) return false;
            else {
                    return false;
            }
        }
        return (up == true && down == true) ? true : false;
    }
}