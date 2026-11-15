package ex06;

public class CallByVal {

	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.printf(" 傳值呼叫前\t a=%d\t b=%d\n", a, b);
		byVal(a, b);
		System.out.printf(" 傳值呼叫後\t a=%d\t b=%d\n", a, b);
	}

	static void byVal(int x, int y) {
		int t; //以變數t作為暫存區，將引數互換
		t = x;
		x = y;
		y = t;
		System.out.printf(" 傳值呼叫中\t x=%d\t y=%d\n", x, y);
	}
}
