package dynamic;

public class Dynamic1 {
	 public static int print(int array[]){
		   int n  = array.length;
		   int count = 0;
		   int max = 0;
		   int end = 0;
		 int array1[] = new int[n];
		 if(n>0) {
			 array1[0] = 1;
			 max = array[0];
			count = array1[0];
		 }
		 for (int i = 1; i < n-1; i++) {
			 if(i+array[i] < max) {
				  end  = max;
			 }else {
				 end = i+array[i];
			 }
			
			//max = Math.max(max, i+array[i]);
			if(i==end) {
				array1[i] = array1[i-end]+1;
				end  = max;
				count = array1[i];
			}
		}
		   return count;
	    }
	 public static void main(String[] args) {
		 int array[] = {2,1,5,5,5,6,7};
		System.out.println(print(array));
	}
}
  