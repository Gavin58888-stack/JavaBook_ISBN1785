package ex05;

import java.util.Scanner;

public class LineraSearch {

	public static void main(String[] args) {
		int[] Adata = new int[] { 4, 14, 1, 2, 10, 8, 5, 12, 11, 16 };
		for (int i = 0; i < Adata.length; i++) {
			System.out.printf("  材 %d计=%d", (i + 1), Adata[i]);
			if (i == 4 || i == 9)
				System.out.println();
		}
		Scanner scn = new Scanner(System.in);
		System.out.print(" 叫块璶穓碝计 ");
		int searchNum = scn.nextInt();
		int num = -1;                  // num单-1ボ⊿Τт戈
		for (int j = 0; j < Adata.length; j++) {
			if (Adata[j] == searchNum) {
				num = j;
				break;
			}
		}
		System.out.println("================");
		if (num == -1)
			System.out.printf(" ⊿Τ硂计--> %d", searchNum);
		else
			System.out.printf("%d 琌材%d计",searchNum, (num + 1));
		scn.close();
	}
}
