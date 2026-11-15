package extendDemo;

class CMath {
    public void getMax(int a, int b) {
        int bigNum;
        if (a > b)
            bigNum = a;
        else
            bigNum = b;
        System.out.printf("%d 與 %d 的最大數為 %d \n",a ,b, bigNum);
    }
}

class SonCMath extends CMath {          // SonCMath繼承CMath類別
	public void getFabonacci(int n) {
		int firstNum = 0, secondNum = 1;
		System.out.printf("前 %d 項的費氏數列為 ", n) ;
	    System.out.printf("%d, %d", firstNum, secondNum);
	    int ans;
	    for(int i=2; i<=n; i++) {
	        ans = firstNum + secondNum;
	        System.out.printf(", %d", ans);
	        firstNum = secondNum;
	        secondNum = ans;
	    }
	    System.out.println();
	}
}

public class ExtendDemo {
	public static void main(String[] args) {
		SonCMath math1 = new SonCMath();
	    math1.getMax(520, 1314);      // 呼叫子類別繼承父類別的方法
	    math1.getFabonacci(15);       // 呼叫子類別自己的方法
	}
}
