package ex04;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請問你給幾顆星？");
		int stars = scn.nextInt(); // 讀取星星數
		int i;
		for (i = 1; i <= stars; i++) {
			System.out.printf("* ");
		}
		System.out.println("最後 i 值為: " + i);
		scn.close();
	}
}
