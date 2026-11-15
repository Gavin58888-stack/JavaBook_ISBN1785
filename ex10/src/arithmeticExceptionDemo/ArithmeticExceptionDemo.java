package arithmeticExceptionDemo;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
	    int a=3, b=0, c;
		try {
		    c = a / b;  // a除以b只定給c，但b=0，會發生除數為0算術例外
		    System.out.printf( "%d除％d 等於%d", a, b, c);
		}
		catch(ArithmeticException e) {
		    System.out.printf("例外內容%s\n", e.toString());
		    System.out.println("說明：數學運算發生錯誤，除數不能為0");
		}
		System.out.println("程式正確執行完畢");
	}

}
