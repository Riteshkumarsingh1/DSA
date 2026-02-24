import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        
        // Step 1: Convert integers to strings
        // Because concatenation comparison string level par karna hai
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort using custom comparator
        // Idea: Decide order based on which concatenation gives larger number
        // Example: "3" and "30"
        // Compare "330" vs "303"
        // Since "330" is bigger, "3" should come before "30"
        Arrays.sort(arr, (a, b) -> {
            String option1 = a + b;   // a followed by b
            String option2 = b + a;   // b followed by a
            
            // We want descending order
            // So we compare option2 with option1
            return option2.compareTo(option1);
        });

        // Step 3: Edge Case
        // If the largest element is "0",
        // that means all elements are zero (e.g., [0,0])
        // So return only single "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Step 4: Build the final result
        // Use StringBuilder (efficient than string concatenation)
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }

        // Step 5: Return final string
        return result.toString();
    }
}