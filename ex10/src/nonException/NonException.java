package nonException;

public class NonException {
	public static void main(String[] args) {
        int[] myarray = new int[10];
	    myarray[10] = 250;  // 陣列註標超過範圍，會發生例外
	    System.out.println("程式正確執行完畢");
	}

}
