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





        //taking base as 26::::;

        int sum=0,p=0;
        int n= columnTitle.length();
        for (int i=n-1;i>=0;i--){
            int temp = columnTitle.charAt(i)-64;
            sum= sum+(int)Math.pow(26,p++)*temp;

        }
        return sum;
    }
}