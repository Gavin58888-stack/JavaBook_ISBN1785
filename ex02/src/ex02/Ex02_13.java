package ex02;
import java.util.Scanner;
public class Ex02_13 {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      System.out.print("請輸入姓名：");
	      String name = scn.nextLine(); 	// 讀入一行字串並指定給name字串變數
	      System.out.printf("Hi! %s !%n", name);
	      System.out.print("請輸入矩形的長和寬（以空白間隔）：");
	      double length = scn.nextDouble();  // 讀入一個浮點數並指定給length
	      double width = scn.nextDouble();   // 讀入一個浮點數並指定給width
	      System.out.printf("矩形的面積為：%.2f%n", length * width);
	      scn.close();
	}
}
