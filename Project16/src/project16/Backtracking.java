package project16;

public class Backtracking {
	public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();
    }

    public static void generatePermutations(int[] array, int n, int i) {
        if (i == n) {
            print(array);
        } else {
            for (int j = i; j < n; j++) {
            System.out.println(j +" "+ i);
                swap(array, i, j);
                generatePermutations(array, n, i + 1);
                swap(array, i, j);
            }
        }
    }

    public static void generateAllPermutations(int[] array) {
        generatePermutations(array, array.length, 0);
    }
public static void main(String[] args) {
	int array[] = {1,2,3};
	int n = 3;
	Backtracking s = new Backtracking();
	generateAllPermutations(array);
}
}
