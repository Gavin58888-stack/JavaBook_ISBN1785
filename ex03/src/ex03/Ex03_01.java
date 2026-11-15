package ex03;
public class Ex03_01 {
	public static void main(String[] args) {
		int age = 20;
		String msg = "未滿18歲不能參加活動";
		if (age >= 18) {
			msg="已滿18歲可以參加活動";
		}
		System.out.println("年齡" + age + "歲，" + msg);
	}
}
