package ex04;
import java.util.Scanner;
public class AverageScore {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score = 0, total = 0, count = 0;// 成績、總分、人數初值設為0
		while (score >= 0) {
			System.out.print("請輸入成績 (輸入負數結束): ");
			score = scn.nextInt();
			if (score >= 0 && score <= 100) {
				total += score; // 加總成績
				count++; // 人數加1
			}
		}
		if (count > 0) {
			System.out.printf("平均分數 = %.2f 分", (double) total / count);
		}
		scn.close();
	}
}