package ex06;

public class Recursive {
	static int fib (int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		System.out.printf("費氏數列第6項 = %d\n", fib(6));
		System.out.printf("費氏數列第9項 = %d\n", fib(9));
	}
}
