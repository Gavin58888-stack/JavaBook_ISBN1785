package threadMethod;

class MyThread extends Thread {  //繼承Thread類別
	MyThread() {
		start();  //啟動執行緒
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.printf("%s執行緒：執行第 %d 次\n", getName(), i);
				sleep(500);  //執行緒暫停0.5秒
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadMethod {

	public static void main(String[] args) {
		MyThread obT1 = new MyThread();
		obT1.setName("T1");  //設定執行緒名稱為T1
		System.out.printf("目前的執行緒為：%s\n", Thread.currentThread().getName());
		System.out.println("執行緒T1 是否活著：" + obT1.isAlive());
		try {
			obT1.join();  //等待所呼叫的obT1執行緒執行完畢
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("執行緒T1 是否活著：" + obT1.isAlive());
	}

}
