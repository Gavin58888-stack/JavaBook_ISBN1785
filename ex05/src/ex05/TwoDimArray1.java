package ex05;

public class TwoDimArray1 {

	public static void main(String[] args) {
		int[][] n = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[0].length; j++){
				System.out.printf(" n[%d][%d] = %d, ", i , j, n[i][j]);
				sum += n[i][j];
			}
			System.out.println();
		}
		System.out.printf(" n 陣列元素總和為 %d", sum);
	}
}
