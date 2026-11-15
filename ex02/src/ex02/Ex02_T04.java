package ex02;

public class Ex02_T04 {

	public static void main(String[] args) {
		int i1 = 5, i2 = 31;
		double d = 3.5;
		float f = 0.5f;
		short s = 20;
		i1 += 8 % 2 + s;
		System.out.printf("i1 = " + i1 + "\n");
		i2 %= s * 2 + 1;
		System.out.printf("i2 = " + i2 + "\n");
		d /= 5 * 4;
		System.out.printf("d = " + d + "\n");
		f *= 3 + 5 % 9;
		System.out.printf("f = " + f + "\n");		
	}

}
