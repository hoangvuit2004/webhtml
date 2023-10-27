package project13;

public class CountString {
	
	public static int wordCount(String input) {
		int count = 0;
		char []charWord = input.toCharArray();
		for (int i = 0; i < charWord.length; i++) {
			if(charWord[i] != ' ') {
				count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	String text = "hoang     vu";
	System.out.println(wordCount(text));
}
}
