package synchronizedDemo;

class GoldClass implements Runnable { // 實作Runnable介面
	int grabed; // 已偷到的金塊數量
	static int totalGold = 20000000; // 金塊總數
	Thread t;

	GoldClass(String name) {
		grabed = 0;
		t = new Thread(this, name);
		t.start(); // 啟動執行緒
	}
	
	public void run() { // 實作Runnable介面的run()方法
		while (grabGold() == true) { // 判斷金塊是否還有剩
			grabed++; // 偷到一塊
		}
		System.out.printf( "%s 總共偷得 %d 個金塊.\n", t.getName(), grabed);
	}
	
	private synchronized static boolean grabGold() {
		if (totalGold > 0) { // 若金塊還有剩才能偷
			totalGold--; // 偷一塊金塊
			return true;
		} else {
			return false;
		}
	}
 }

public class SynchronizedDemo {

	public static void main(String[] args) {
		System.out.printf("共有 %d 個金塊!\n", GoldClass.totalGold);
		GoldClass tA = new GoldClass("張三");
		GoldClass tB = new GoldClass("李四");
		GoldClass tC = new GoldClass("王五");
	}

}
