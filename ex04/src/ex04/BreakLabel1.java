package ex04;
public class BreakLabel1 {
	public static void main(String[] args) {
		boolean i = false;
		Block1: {
			System.out.println("這是Block1敘述區塊");
			i = true;
			Block2: {
				if (i == true)
					break Block1;
				System.out.println("這是Block2敘述區塊"); // 不會執行
			}
			System.out.println("已經跳出Block2敘述區塊");
		}
	}
}