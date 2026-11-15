package lambdaRunnable1;

class MyThread implements Runnable { // MyThread類別實作Runnable介面
	public void run() { // 實作Runnable介面的run()方法
		// 執行緒所執行的處理，依序將目前的執行緒印10次
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s; 印第 %d 次%n", Thread.currentThread().getName(), i);
		}
	}
}

public class LambdaRunnable1 {
	public static void main(String[] args) { // 程式進入點
		// 建立Runnable介面物件obR
		MyThread obR = new MyThread();
		// 建立執行緒物件t，並帶入obR的Runnable介面物件
		Thread t = new Thread(obR);
		// 啟動執行緒物件t，此時執行Runnable介面物件的run()方法
		t.start();
	}
}
