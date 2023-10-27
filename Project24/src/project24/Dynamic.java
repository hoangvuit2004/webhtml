package project24;

public class Dynamic {
public static int printString(String a, String b) {
	int array[][] = new int[a.length()+1][b.length()+1];
	int n = a.length();
	int c = b.length();
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <= c; j++) {
			if(i==0 || j==0) {
				array[i][j] = 0;
			}
		}
	}
	
	
	
	for (int i = 1; i <=a.length(); i++) {
		for (int j = 1; j <= b.length(); j++) {
			if(a.charAt(i-1) == b.charAt(j-1)) {
				array[i][j] = array[i-1][j-1] + 1;
			}else {
				array[i][j] = Math.max(array[i][j-1], array[i-1][j]);
			}
		}
	}
	return array[a.length()][b.length()];
}
public static void main(String[] args) {
	String a = "abdef";
	String b  = "abedfd";
	
	System.out.println(printString(a, b));
}
}
