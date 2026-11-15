package ex06;

public class OverLoading {
	static int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	static double max(double[] vArray) {
		double n = vArray[0];
		for (int i = 1; i < vArray.length ; i++) {
			if (vArray[i] > n)
				n = vArray[i];
		}
		return n;
	}

	public static void main(String[] args) {
		int a = 26, b = 37;
		System.out.printf("%d ㎝ %d程计 %d\n", a, b, max(a, b));
		double f[] = new double[] { 2.1, 5.3, 7.2, 4.8 };
		System.out.printf("皚じ [2.1,5.3,7.2,4.8] い程计%.2f",max(f));
	}

}
