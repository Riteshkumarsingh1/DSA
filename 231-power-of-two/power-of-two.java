class Solution {
    public boolean isPowerOfTwo(int n) {
        long i =1;
        while (i<n){
            i=i*2;
        }
        //method 1

        // if(i==n){
        //   return true;
        // }else{
        //    return false;
        //}


 
 //method 2 using ternary operator
 
        // return i== n ? true: false;
       //or
        return i==n;
    }
}