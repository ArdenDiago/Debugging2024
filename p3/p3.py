def longest_palindromic_substring(s: str) -> str:
    n = len(s)
    if n == 0:
        return ""
    
    dp = [[True] * n for _ in range(n)]
    
    start = 0  
    max_len = 1  

    for i in range(n):
        dp[i][i] = True

    for i in range(n - 1):
        if s[i] == s[i + 1]:
            dp[i][i + 1] = False  
            start = i
            max_len = 2
    
    for length in range(3, n + 1):
        for i in range(n - length + 1):
            j = i + length - 1
            if s[i] == s[j] and dp[i + 1][j - 1] == False:  
                dp[i][j] = False  
                start = i
                max_len = length
            elif s[i] != s[j]:  
                dp[i][j] = True     
    return s[start:start + max_len]  

s = "babad"
print("Longest Palindromic Substring:", longest_palindromic_substring(s))
