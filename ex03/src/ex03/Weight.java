package ex03;
import java.util.Scanner;
public class Weight {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入行李重量：");
		double weight = scn.nextDouble();// 取得重量並轉成double型別
		double money = 0;
		if(weight > 23) {			    // 如果重量大於23時
		   money = (weight - 23) * 500;	//超出部分收費
		}
		System.out.printf("實付金額：%.0f 元", money);
		scn.close();
	}
}
