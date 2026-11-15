package multiException1;

public class MultiException1 {

	public static void main(String[] args) {
		int[] myarray = new int[10];
		try {
		    int test = 120 / 5;
		    myarray[5] = 120;
		    int n = Integer.parseInt("一百二十");  //字串無法轉整數
		}
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.printf("例外內容%s\n", e.toString());
		    System.out.println("說明:陣列索引超過範圍");
		}
		catch(ArithmeticException e) {
		    System.out.printf("例外內容%s\n", e.toString());
		    System.out.println("說明:數學運算發生錯誤，除數不能為0");
		}
		catch(Exception e) {
		    System.out.printf("例外內容%s\n", e.toString());
		    System.out.println("例外發生");
		}
		System.out.println("程式正確執行完畢");
	}

}
