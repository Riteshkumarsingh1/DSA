class Solution {
    public int heightChecker(int[] heights) {
        int [] expected = new int[heights.length];
        for (int i =0; i<heights.length; i++) {
            expected[i] = heights[i];
        }
        // now apply bubblesort on expected here

        int j=0;
        boolean hasSwapped = true;
        while(hasSwapped){
            hasSwapped = false;
        
        for (int i =0; i<expected.length-1; i++){
            if(expected[i]> expected[i+1]){
                int temp = expected[i];
                expected[i]= expected[i+1];
                expected[i+1]= temp;
                hasSwapped = true;
            }
        }
        j++;
        }
        int count =0;
        for (int i=0; i<expected.length;i++){
            if (expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}