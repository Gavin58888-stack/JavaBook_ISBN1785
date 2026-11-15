package ex03;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// 例1
		int score = 77;
		switch (score / 10) {
		case 6, 7, 8, 9, 10 -> System.out.println("及格"); // 多個case值可以寫在一起
		default -> System.out.println("不及格");
		}
		// 例2
		char ch = 'y';
		switch (ch) {
		case 'Y', 'y' -> System.out.println("同意");
		default -> System.out.println("不同意");
		}
		// 例3 賦值語法會將switch的結果指定給變數
		int num = 3;
		String numString = switch (num) {
		case 1 -> "一";
		case 2 -> "二";
		case 3 -> "三";
		case 4 -> "四";
		default -> "錯誤";
		};
		System.out.println(num + " = " + numString);
		// 例4 前面分數等級的實作改用Java新語法編寫
		char grade;
		switch (score / 10) {
		case 10, 9, 8 -> grade = '甲';
		case 7 -> grade = '乙';
		case 6 -> grade = '丙';
		default -> grade = '丁';
		}
		System.out.println(score + " = " + grade);		
	}
	
}
