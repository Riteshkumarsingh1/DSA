class Solution {
    public boolean isPalindrome(String s) {
    //   
    










    //other solution 

    final char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            while (left < right && !((charArray[left] >= 'a' && charArray[left] <= 'z') ||
                    (charArray[left] >= 'A' && charArray[left] <= 'Z') ||
                    (charArray[left] >= '0' && charArray[left] <= '9'))) {
                left++;
            }
            while (left < right && !((charArray[right] >= 'a' && charArray[right] <= 'z') ||
                    (charArray[right] >= 'A' && charArray[right] <= 'Z') ||
                    (charArray[right] >= '0' && charArray[right] <= '9'))) {
                right--;
            }
            char cLeft = charArray[left];
            char cRight = charArray[right];
            if (cLeft >= 'A' && cLeft <= 'Z') {
                cLeft = (char) (cLeft + 32);
            }
            if (cRight >= 'A' && cRight <= 'Z') {
                cRight = (char) (cRight + 32);
            }
            if (cLeft != cRight) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}