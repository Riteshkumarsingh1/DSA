class Solution {
    public int fib(int n) {
       return fibRecursive(n); 
    }
    private int fibRecursive (int n){

        if(n<2){
            return n;
        }

        return fibRecursive(n-1) + fibRecursive(n-2);
    }
    
}