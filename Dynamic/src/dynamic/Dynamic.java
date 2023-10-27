package dynamic;

public class Dynamic {
	public static boolean isMatch(String s, String p) {
     int sLen = s.length();
     int pLen = p.length();
     int sIndex = 0;
     int pIndex = 0;
     int sMatch = 0;
     int pMatch = -1;
     while(sIndex < sLen) {
    	 if((pIndex < pLen) &&(p.charAt(pIndex) == s.charAt(sIndex) || p.charAt(pIndex) == '?')) {
    		 sIndex ++;
    		 pIndex ++;	 
    	 }else if(pIndex < pLen && p.charAt(pIndex) == '*') {
    		 sMatch = sIndex;
    		 pMatch = pIndex;
    		 pIndex ++;
    		 
    			 
    	 }else if(pMatch == -1) {
    		 return false;
    	 }else {
    		 sMatch++;
    		 sIndex = sMatch;
    		 pIndex = pMatch + 1;
    	 }
     }
     while(pIndex < pLen && p.charAt(pIndex) == '*') {
    	 pIndex++;
     }
     return pIndex == pLen;
    }

public static void main(String[] args) {
	String a = "aabc";
	String p = "a*";
	System.out.println(isMatch(a, p));
}
}
