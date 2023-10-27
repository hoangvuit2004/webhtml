package project20;

public class ThamLam {
	
public static void main(String[] args) {

	   int A = 1430; // Số nguyên A
       int B = 4862; // Số nguyên B

       int maxSum = findMaxSum(A, B);
       int minSum = findMinSum(A, B);

       System.out.println("Tổng lớn nhất: " + maxSum);
       System.out.println("Tổng nhỏ nhất: " + minSum);
   }

   public static int findMaxSum(int A, int B) {
       int maxSum = 0;
       int multiplier = 1;

       while (A > 0 || B > 0) {
           int digitA = A % 10;
           int digitB = B % 10;

           digitA = replaceDigit(digitA);
           digitB = replaceDigit(digitB);

           maxSum += (digitA + digitB) * multiplier;

           A /= 10;
           B /= 10;
           multiplier *= 10;
       }

       return maxSum;
   }

   public static int findMinSum(int A, int B) {
       int minSum = 0;
       int multiplier = 1;

       while (A > 0 || B > 0) {
           int digitA = A % 10;
           int digitB = B % 10;

           digitA = replaceMin(digitA);
           digitB = replaceMin(digitB);

           minSum += (digitA + digitB) * multiplier;

           A /= 10;
           B /= 10;
           multiplier *= 10;
       }

       return minSum;
   }

   public static int replaceDigit(int digit) {
       if (digit == 5) {
           return 6;
       } 
           return digit;
       
   }
   public static int replaceMin(int a  ){
	 if(a == 6) {
		 return 5;
	 }
	 return a;
   }
}
