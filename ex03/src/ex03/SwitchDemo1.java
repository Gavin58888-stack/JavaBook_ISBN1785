package ex03;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// 例1
		int num=1;
		switch (num) {	// 數值變數
		case 1: 
			System.out.println("一月");
			break;
		case 2:
			System.out.println("二月");
			break;
		default: 
			System.out.println("不是一月或二月"); 
		}
		 
		// 例2
		int num1=1,num2=2;
		switch (num1 + num2) {	// 運算式
		case 1: 
		case 2:
		case 3:
			System.out.println("兩數相加的值介於1~3");
			break;
		default: 
			System.out.println("兩數相加的值不是介於1~3");
		}
		
		// 例3
		char ch='y';
		switch (ch) {	// 字元變數
		case 'Y': 
		case 'y': 
			System.out.println("繼續使用！");
			break;
		default: 
			System.out.println("離開系統！"); 
		}

		// 例4
		String title="主任";
		switch (title) {	// 字串變數
		case "董事長": 
			System.out.println("公司的領導！");
			break;
		case "經理": 
			System.out.println("公司的中堅！");
			break;
		default: 
			System.out.println("公司的基礎！"); 
		}

	}

}
