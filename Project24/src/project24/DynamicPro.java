package project24;

public class DynamicPro {
	public static  String longestPalindrome(String s) {
		int n = s.length();
		boolean array[][] = new boolean[n][n];
		int a[] = new int[] {0,0};
		for (int i = 0; i < n; i++) {
			array[i][i]  = true;
		}
		for (int i = 0; i < n-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				array[i][i+1]  = true;
				a[0] = i;
				a[1] = i+1;
			}
		}
		for(int len  = 2; len < n;len++) {
			for (int i = 0; i < n - len; i++) {
				int j = len + i;
				if(s.charAt(i) == s.charAt(j) && array[i+1][j-1] == true) {
					array[i][j] = true;
					a[0] = i;
					a[1] = j;
				}
			}
		}
		int i = a[0];
		
		int j = a[1];
       return s.substring(i, j+1);
    }
	 public static boolean isMatch(String text, String pattern) {
	        if (pattern.isEmpty()) return text.isEmpty();
	        boolean first_match = (!text.isEmpty() &&
	                               (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

	        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
	            return (isMatch(text, pattern.substring(2)) ||
	                    (first_match && isMatch(text.substring(1), pattern)));
	        } else {
	            return first_match && isMatch(text.substring(1), pattern.substring(1));
	        }
	    }
	 public static boolean regularEx(String a, String b) {
		 
		 int n = a.length();
		 int m  = b.length();
		
		 boolean array[][] = new boolean[n+1][m+1];
		 array[0][0] = true;
		 for (int i = 1; i < array[0].length; i++) {
			if(b.charAt(i-1) == '*') {
				array[0][i] = array[0][i-2];
			}
		}
		
		 for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				if(a.charAt(i-1) == b.charAt(j-1) || b.charAt(j-1) == '.') {
					array[i][j] = array[i-1][j-1];
				}
				else if(b.charAt(j-1) == '*') {
					array[i][j] = array[i][j-2];
					if(b.charAt(j-2) == '.' || b.charAt(j-2) == a.charAt(i-1)) {
						array[i][j] = array[i][j] | array[i-1][j];
					}
				}else {
					array[i][j] = false;
				}
			}
			
		}
		 
		 return array[n][m];
	 }
	 public static void peint() {
		 int n = 3;
		 int c = 4;
		 if(n==3 | c == 5) {
			 System.out.println("truwwww");
		 }
	 }
	public static void main(String[] args) {
		String s = "aabcd";
		System.out.println(longestPalindrome(s));
		String a= "a";
		String b = "a*";
	peint();
		System.out.println(regularEx(a, b));
	
		
		
	}
}
