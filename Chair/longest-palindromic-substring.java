class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int maxLengthStrStart = 0;
        int maxLengthStrEnd = 0;
        for (int i = 0; i < s.length(); i++) {
            int midOfSingle = getLength(s, i, i);
            int midOfDouble = getLength(s, i, i + 1);
            int len = midOfDouble > midOfSingle ? midOfDouble : midOfSingle;
            if (len > maxLengthStrEnd - maxLengthStrStart) {
                maxLengthStrStart = i - (len - 1) / 2;
                maxLengthStrEnd = i + len / 2;
            }
        }

        return s.substring(maxLengthStrStart, maxLengthStrEnd + 1);
    }

    public int getLength(String s, int start, int end) {
        int maxLength = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            maxLength = end - start - 1;
        }

        return maxLength;
    }
}