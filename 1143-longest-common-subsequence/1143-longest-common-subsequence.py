class Solution(object):
    def longestCommonSubsequence(self, text1, text2):
        dp = []
        m = len(text1)
        n = len(text2)
        for i in range(m+1):
            res = []
            for j in range(n+1):
                res.append(0)
            dp.append(res)

        for i in range(1,m+1):
            for j in range(1,n+1):
                if text1[i-1]==text2[j-1]:
                    dp[i][j] = 1+dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i][j-1],dp[i-1][j])

        return dp[m][n]        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna