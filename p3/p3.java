public class LongestPalindrome {

    public static String longestPalindromicSubstring(String s) {
        int n = s.length();
        if (n == 0) return "";

        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = false; 
                start = i;
                maxLen = 2;
            }
        }

        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && !dp[i + 1][j - 1]) { 
                    dp[i][j] = false;  
                    start = i;
                    maxLen = length;
                }
            }
        }

        return s.substring(start, start + maxLen);  
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring(s));
    }
}

