package ex05;

import java.util.Scanner;

public class Non_R_array2 {

	public static void main(String[] args) {
		String[][] data = new String[3][];
		Scanner scn = new Scanner(System.in);
		for(int x = 0; x < 3; x ++) {
			System.out.printf("%d號同學接種幾劑疫苗：", ( x + 1));
			data[x] = new String[scn.nextInt()];
			for(int y = 0; y < data[x].length; y ++) {
				System.out.printf("請輸入第%d次接種日期：", (y + 1));
				data[x][y] = scn.next();
			}
		}
		scn.close();
		for(int x = 0; x < 3; x ++) {
			System.out.printf("\n%d號同學接種日期：", (x + 1));
			for(int y = 0; y < data[x].length; y ++)
				System.out.printf(" %s", data[x][y]);
		}
	}
}
