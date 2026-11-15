package ex03;
import java.util.Scanner;
public class Fare {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入年齡：");
		int age = scn.nextInt(); // 取得年齡
		int fare;
		if (age <= 6) {
		    fare = 0; // 幼兒免費
		} else if (age <= 12) {
		    fare = 40; // 兒童票
		} else if (age <= 64) {
		    fare = 100; // 全票
		} else {
		    fare = 50; // 敬老票
		}
		System.out.printf("年齡：%d 歲，票價：%d 元", age, fare);
		scn.close();
	}
}