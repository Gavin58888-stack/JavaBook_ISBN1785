package multiException2;

public class MultiException2 {
	public static void main(String[] args) {
	    int[] myarray = new int[10];
		try {
		    int test = 120 / 5;
		    myarray[5] = 120;
		    int n = Integer.parseInt("一百二十");  //字串無法轉整數
		}
		catch(Exception e) {      //此catch必須放在最後，否則會被前面catch攔截
		    System.out.printf("例外內容%s\n", e.toString());
		    System.out.println("例外發生!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.printf("例外內容%s\n", e.toString());
		    System.out.println("說明:陣列索引超過範圍");
		}
		catch(ArithmeticException e) {
		    System.out.printf("例外內容%s\n", e.toString());
		    System.out.println("說明:數學運算發生錯誤，除數不能為0!");
		}
		System.out.println("\n程式正確執行完畢!!");
	}

}
