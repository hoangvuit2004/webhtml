package project13;

public class Binary {
	// he 8 thi chiaiu cho 8 r chia 8 , còn 2 thì i chang 
public static  int[]  binary(int decimalNumber ) {
	 if (decimalNumber == 0) {
         return new int[]{0};
     }
	 int[] binary = new int[32]; // Giả sử số nguyên có tối đa 32 bit
     int index = 0;
     while (decimalNumber > 0) {
         binary[index++] = decimalNumber % 8;
         decimalNumber /= 8;
     }

     int[] result = new int[index];
     for (int i = 0; i < index; i++) {
         result[i] = binary[i];
     }

     return result;

}
public static void print(int de) {
	 int[] binaryNumber = binary(de);
     System.out.println("Binary representation of " + de + " is: ");
     for (int i = binaryNumber.length - 1; i >= 0; i--) {
         System.out.print(binaryNumber[i]);
     }
}
public static void main(String[] args) {
	int i = 8;
	
	print(i);
}
}
