package project25;

import java.util.Stack;

public class Dynamic {
public static boolean check(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i) == '(') {
			stack.push('(');
		}else if(!stack.empty() && stack.peek()=='(') {
			stack.pop();
		}else {
			return false;
		}
	}
	return stack.empty();
	
}
public static  int longestValidParentheses(String s) {
	int max = 0;
	for (int i = 0; i < s.length(); i++) {
		for (int j = i+2; j <= s.length(); j+=2) {
			if(check(s.substring(i,j))) {
				max = Math.max(max, j-i);
			}
		}
	}
    return max;
}
public static int show(int array[]) {
	int count = 0;
	for (int i = 0; i < array.length-2; i++) {
		int j = i+2;
		if(array[i] > 0 && array[j] > 0 && array[j-1] == 0  ) {
			if(array[j-1] == 0 && array[i] % array[j] != 0) {
				count+=array[i]%array[j];
			}else {
				count+=array[j];
			}
		}
		}
	return count; 
}
public static void main(String[] args) {
	String s = "))())(()))()(((()())(()(((()))))((()(())()((((()))())))())))()(()(()))))())(((())(()()))((())()())((()))(()(())(())((())((((()())()))((()(())()))()(()))))))()))(()))))()())()())()()()()()()()))()(((()()((()(())((()())))(()())))))))(()()(())())(()))))))()()())((((()()()())))))((())(())()()(()((()()))()()())(()())()))()(()(()())))))())()(())(()))(())()(())()((())()((((()()))())(((((())))())())(()((())((()()((((((())))(((())))))))(()()((((((()(((())()(()))(()())((()(((()((()(())())()())(((()))()(((()))))(())))(())()())()(((()))))((())())))())()()))((((()))(())()())()(((())(())(()()((())()())()()())())))((()())(()((()()()(()())(()))(()())((((()(()(((()(((())()((()(()))())()())))))))))))()())()(()(((())()))(((()))((((()())())(()())((()())(()()((()((((()())))()(())(())()))))(())())))))(((((((())(((((()))()))(()()()()))))))(()(()(()(()()(((()()))((()))())((())())()())()))()()(((())))()(())()()(())))(((()))))))))(())((()((()((()))))()()()((())((((((((((()(())))(())((()(()())())(((((((()()()()))())(((()())()(()()))))(()()))))(((()()((()()()(((()))))(()()())()()()(()))))()(())))))))()((((((((()((())))))))(()))()((()())())(";
	System.out.println(longestValidParentheses(s));
	System.out.println(1%2);
	int array[] = {1,0,2,3,2,0,2,0,3};
	System.out.println(show(array));
}
}
