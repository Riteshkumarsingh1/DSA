class Solution {
    List<String> ans;

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }

        pad("", digits);
        return ans;
    }

    void pad(String p, String up) {
        if (up.isEmpty()) {
            ans.add(p);
            return;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int digit = up.charAt(0) - '0';
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            pad(p + letters.charAt(i), up.substring(1));
        }
    }
}
