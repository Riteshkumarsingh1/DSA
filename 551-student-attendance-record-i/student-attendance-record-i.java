class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
                countL = 0;      // ✅ L ka streak toot gaya, reset karo
            } else if (s.charAt(i) == 'L') {
                countL++;        // ✅ consecutive count
            } else {
                countL = 0;      // ✅ P aaya, streak reset
            }

            if (countA > 1 || countL > 2) {
                return false;
            }
        }
        return true;
    }
}

