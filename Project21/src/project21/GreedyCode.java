package project21;

public class GreedyCode {
	public static int prinSumArray(int a[], int k) {
		int b[] = new int[k];
		int c[] = new int[a.length - k];
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]> a[j]) {
					temp= a[i];
					a[i]  = a[j];
					a[j] = temp;
				}
			}
		}
	for (int i = 0; i < k; i++) {
		b[i] = a[i];
		
	}
	int r = 0;
	for (int i = k; i < a.length; i++) {
		c[r] = a[i];
		r++;
		
	}
	
	
		int sumb= 0;
	    for (int j = 0; j < k; j++) {
			sumb+=b[j];
			
		}
	    
	    int sumc= 0;
	    for (int j = 0; j < a.length-k; j++) {
			sumc+=c[j];
		}	
	    return sumc - sumb;
	}
	public static void main(String[] args) {
		int a[] = {1,1,1,1,1,1,1,1 };
		int k = 3;
		
		System.out.println(prinSumArray(a, k));
	}
}
