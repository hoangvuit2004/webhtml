package project16;

public class Search {
public static int binarySearch(int array[], int x, int l , int r) {
	int index=-1;
	if(l>r) {
		index = -1;
		
	}else {
		int mid = (l+r)/2;
		if(x< array[mid]) {
			 index = binarySearch(array, x, l, mid-1);
		}else if(x>array[mid]) {
			index =  binarySearch(array, x, mid+1, r);
		}else {
			while(array[mid-1] == x && mid >=1) {
				mid-=1;
				if(array[mid] == x && mid == 0) {
					index = mid;
					break;
				}
				
			}
			index  = mid;
		}
	}
	return index;
}
public static int binarySearch1(int array[], int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Phần tử được tìm thấy, trả về chỉ số
        } else if (array[mid] < target) {
            left = mid + 1; // Tìm kiếm nửa phải của mảng
        } else {
            right = mid - 1; // Tìm kiếm nửa trái của mảng
        }
    }

    return -1; // Không tìm thấy, trả về -1
}

public static void main(String[] args) {
	int array[] = {2,4,4,4,4,8,8,8};
	int x = 10;
	int y = 5;
	x += y++;
	System.out.println(x);
	
			int[] numbers = {1, 2, 3, 4, 5};
			int $asdas = 2;
			System.out.println(
					5 + 7 + "8" + 9);
		
}
}
