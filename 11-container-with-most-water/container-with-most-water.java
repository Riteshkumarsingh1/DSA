// class Solution {
//     public int maxArea(int[] height) {
//         int maxArea = 0;
//         int i = 0, j = height.length - 1;

//         while (i < j) {
//             int currArea = Math.min(height[i], height[j]) * (j - i);
//             maxArea = Math.max(maxArea, currArea);

//             if (height[i] < height[j]) {
//                 i++;
//             } else {
//                 j--;
//             }
//         }
//         return maxArea;
//     }
// }



class Solution{
    public int maxArea(int[] height){
        int res =0;
        int li = 0;
        int ri = height.length -1;
        while(li<ri){
            int left = height[li];
            int right = height[ri];
            int area = Math.min(left, right)*(ri-li);
            res = Math.max(res,area);
            if(left<right){
                li++;
            }else{
                ri--;
            }
        }
        return res;
    }
}