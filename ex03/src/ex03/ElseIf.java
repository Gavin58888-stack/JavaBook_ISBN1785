package ex03;
import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請問是否有會員卡:(請輸入Y或N) ");
		String memberCard = scn.next(); // 取得使用者輸入字串
		if (memberCard.equals("Y")) {
			System.out.println("恭喜您，可享有購物折扣！");
		} else {
			System.out.println("很抱歉，您無法享有購物折扣。");
		}
		// String msg = (memberCard.equals("Y")) ? "恭喜您，可享有購物折扣！" : "很抱歉，您無法享有購物折扣。";
		// System.out.println(msg);
		scn.close();
	}
}