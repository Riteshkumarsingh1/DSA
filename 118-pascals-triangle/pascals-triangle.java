class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        for(int i=1; i<numRows;i++){   //Starts a loop to construct each row of Pascal’s Triangle from the second row onward (since the first row is already initialized before this loop).
            List<Integer>prev_row = triangle.get(i-1); // Retrieves the previous row (the one just constructed) from the triangle for reference when building the new row.//This is key, as each value (except the first and last) in Pascal’s Triangle is the sum of the two values above it.



            List<Integer>curr_row = new ArrayList<>();  //Initializes a new list to store the numbers in the current row
            curr_row.add(1); //Adds 1 at the start of the current row
            for(int j=1; j<i;j++){  //Iterates over the positions in the row that need to be filled (the inner values), excluding the first and last, which are always 1
            curr_row.add(prev_row.get(j-1) + prev_row.get(j)); //Each element (other than the boundary 1s) is the sum of the two numbers directly above it in the previous row.Takes element j-1 and j from the previous row, adds them, and appends the result to the current row
            }


            curr_row .add(1);
            triangle.add(curr_row);
         }
         return triangle;
        
    }
}