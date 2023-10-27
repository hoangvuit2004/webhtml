package project12;

public class UpperString {
	public static String capitalizeFirstLetter(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
			if(i==0 || chars[i-1] == ' ') {
				chars[i] = Character.toUpperCase(chars[i]);
			}else {
				chars[i] = Character.toLowerCase(chars[i]);
			}
		}
        return new String(chars);
    }
public static void main(String[] args) {
	  String input = "nguyen bui hoang vu  ";
      String result = capitalizeFirstLetter(input);
      System.out.println("Kết quả: " + result);
	
}
}
