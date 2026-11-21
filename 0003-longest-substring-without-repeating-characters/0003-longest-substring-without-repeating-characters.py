class Solution(object):
    def lengthOfLongestSubstring(self, s):
        seen = set()
        left = 0
        mx = 0
        for i in range(len(s)):
            while s[i] in seen:
                seen.remove(s[left])
                left = left+1
            seen.add(s[i])
            length = i-left+1
            mx = max(length,mx)

        return mx
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna