import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HHH {
	public static  void print() {
		int array[]= {21,12,34};
		List<Integer> list = new ArrayList<>();
		for (Integer string : array) {
			list.add(string);
		}
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1 > o2) {
					return 1;
				}else {
					return -1;
				}
				
			}
		});
		System.out.println(list);
	}
public static void main(String[] args) {
	print();
}
}
