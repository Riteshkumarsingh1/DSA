class Solution {
    public boolean isValid(String s) {
        char[]arr = s. toCharArray();
        Stack <Character> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            char a= arr[i];
            if(stack.isEmpty()){
                stack.push(a);
            }else{
                char top = stack.peek();
                if(a-top == 1|| a- top ==2){
                    stack.pop();
                }else{
                    stack.push(a);
                }
            }
        }
        return stack.isEmpty();
    }
}