class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = Math.min(s.length(),1);
        Set<Character> seen  = new HashSet<>();

        while(end<s.length())
        {
            char c = s.charAt(end);
            while(seen.contains(c))
            {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(c);
            int windowSize = end-start+1;
            maxLength  = Math.max(maxLength,windowSize);
            end++;
        }
        return maxLength;
    }
}