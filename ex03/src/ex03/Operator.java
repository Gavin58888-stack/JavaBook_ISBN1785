package ex03;
import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入運算符號(+、-、*、/)：");
		String operator = scn.next();
		System.out.print("請輸入第一個數字：");
		double num1 = scn.nextDouble();
		System.out.print("請輸入第二個數字：");
		double num2 = scn.nextDouble();
		switch (operator) {
		    case "+":
		        System.out.printf("結果：%.2f%n", num1 + num2); break;
		    case "-":
		        System.out.printf("結果：%.2f%n", num1 - num2); break;
		    case "*":
		        System.out.printf("結果：%.2f%n", num1 * num2); break;
		    case "/":
		        if (num2 != 0) {
		            System.out.printf("結果：%.2f%n", num1 / num2);
		        } else {
		            System.out.println("錯誤：除數不能為零");
		        }
		        break;
		    default:
		        System.out.println("無效的運算符號");
		}
		scn.close();
	}
}
