class Solution {
    public int titleToNumber(String columnTitle) {
      //converting it to char aray:::::::::::
      
        // char[]c = columnTitle.toCharArray();
        // int result =0;
        // for (int i=0;i<c.length;i++){
        //     int num = c[i]-65+1;
        //     result = result*26+num;
        // }
        // return result;





        //taking base as 26::::
        /* example :
            
           AZA
        place value of all wiil be as:
        from backward ---  initially sum =0
        A=1*(26)^0       sum=0+1=1
        Z=26*(26)^1      sum=1+(26*26)=677
        A=1*(26)^2       sum = 677+676 = 1353
        
        finally answer, for AZA is === 1353
         */

        int sum=0,p=0;   // p here is position of of charater
        int n= columnTitle.length();    // traversing the length of columnTitle from backward right to left
        for (int i=n-1;i>=0;i--){     // backtracing element from right to left
            int temp = columnTitle.charAt(i)-64;  //finding the location of char/ element from 1 to 26
            sum= sum+(int)Math.pow(26,p++)*temp;  //returning the place value of each charater

        }
        return sum;
    }
}