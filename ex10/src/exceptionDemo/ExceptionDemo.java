package exceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		   int[] myarray = new int[10];
		   try {
		       myarray[10] = 250;
		   }
		   catch(ArrayIndexOutOfBoundsException e) {
		       System.out.printf("例外內容\n", e.toString());
		       System.out.println("說明:陣列索引超過範圍");
		   }
		   System.out.println("程式正確執行完畢");
	}

}
