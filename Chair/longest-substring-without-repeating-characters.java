class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pStart = 0;
        int pEnd = 0;
        int len = s.length();
        int maxLength = 0;
        Set<Character> characters = new HashSet<>();
        while (pStart < len && pEnd < len) {
            if (characters.contains(s.charAt(pEnd))) {
                characters.remove(s.charAt(pStart));
                pStart++;
            } else {
                characters.add(s.charAt(pEnd));
                pEnd++;
                maxLength = (pEnd - pStart) > maxLength ? pEnd - pStart : maxLength;
            }
        }
        return maxLength;
    }
}