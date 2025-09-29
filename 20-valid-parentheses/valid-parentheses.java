// class Solution {
//     public boolean isValid(String s) {
//         char[]arr = s. toCharArray();
//         Stack <Character> stack = new Stack<>();
//         for(int i=0; i<arr.length; i++){
//             char a= arr[i];
//             if(stack.isEmpty()){
//                 stack.push(a);
//             }else{
//                 char top = stack.peek();
//                 if(a-top == 1|| a- top ==2){
//                     stack.pop();
//                 }else{
//                     stack.push(a);
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }






//other bruet force approach:::
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Push every opening bracket to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty, no opening bracket for current closing
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                // Check for correct matching
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // If stack is empty, all brackets are matched correctly
        return stack.isEmpty();
    }
}
