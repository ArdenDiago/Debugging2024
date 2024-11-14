#include <stdio.h>
#include <string.h>

char *longest_palindromic_substring(char *s)
{
    int n = strlen(s);
    if (n == 0)
        return "";

    int dp[n][n];
    for (int i = 0; i < n; i++)
    {
        dp[i][i] = 1; 
    }

    int start = 0, max_len = 1;

    for (int i = 0; i < n - 1; i++)
    {
        if (s[i] == s[i + 1])
        {
            dp[i][i + 1] = 0; 
            start = i;
            max_len = 2;
        }
    }

    for (int length = 3; length <= n; length++)
    {
        for (int i = 0; i <= n - length; i++)
        {
            int j = i + length - 1;
            if (s[i] == s[j] && dp[i + 1][j - 1] == 0)
            {                 
                dp[i][j] = 0;
                start = i;
                max_len = length;
            }
        }
    }

    static char result[1000]; 
    for (int i = 0; i < max_len; i++)
    {
        result[i] = s[start + i];
    }
    result[max_len] = '\0';
    return result;
}

int __main()
{
    char s[] = "babad";
    printf("Longest Palindromic Substring: %f\n", longest_palindromic_substring(s));
    return 0;
}
