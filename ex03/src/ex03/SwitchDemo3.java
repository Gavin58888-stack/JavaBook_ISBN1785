package ex03;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// 例1 查詢服裝的售價 - 使用傳統switch語法
		String size = "S";
		int price = 0;
		switch (size) {
		case "S":
		case "M":
			price = 500;
			break;
		case "L":
		case "XL":
			price = 700;
			break;
		default:
			price = 1000;
		}
		System.out.printf("%s尺寸售價%d元%n", size, price);
		
		//例2 使用新switch語法
		switch (size) {
		case "S", "M" -> price = 500;
		case "L", "XL" -> price = 700;
		default -> price = 1000;
		}
		System.out.printf("%s尺寸售價%d元%n", size, price);
		
		//例3 使用新switch語法配合賦值
		price = switch (size) {
		case "S", "M" -> 500;
		case "L", "XL" -> 700;
		default -> 1000;
		};
		System.out.printf("%s尺寸售價%d元%n", size, price);
		
		//例4 使用yield關鍵字回傳值
		price = switch (size) {
		case "S", "M":
			yield 500;
		case "L", "XL":
			yield 700;
		default:
			yield 1000;
		};
		System.out.printf("%s尺寸售價%d元%n", size, price);
		
		//例5 多行敘述時使用yield保留字回傳值
		price = switch (size) {
		case "S", "M" -> {
			System.out.printf("M尺寸目前缺貨%n");
			yield 500;
		}
		case "L", "XL" -> 700;
		default -> 1000;
		};
		System.out.printf("%s尺寸售價%d元%n", size, price);
	}

}
