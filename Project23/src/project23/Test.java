package project23;

public class Test {
    public static int findLongestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return 1;
        }

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int maxLength = 1;  
        int start = 0; 

      
       for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

      
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (len > maxLength) {
                            maxLength = len;
                            start = i;
                        }
                    }
                }
            }
        }

      
        return maxLength;
    }
public static void main(String[] args) {
	String a = "abbcaac";
	int n = 9;
	System.out.println(findLongestPalindrome(a));
}
}
