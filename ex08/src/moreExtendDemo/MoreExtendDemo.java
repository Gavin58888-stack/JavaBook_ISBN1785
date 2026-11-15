package moreExtendDemo;

class CMath {
    public void getMax(int a, int b) {
        int bigNum;
        if (a > b)
            bigNum = a;
        else
            bigNum = b;
        System.out.printf("%d 與 %d 的最大數為 %d \n", a ,b, bigNum);
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

class GrandSonCMath extends SonCMath {  //GrandSonCMath繼承SonCMath類別	
	public void getFactorial(int a) {
        int ans = 1, i;
        System.out.printf("%d ! = ", a);
        for (i = 1; i < a; i++) {
            System.out.printf("%d * ", i);
            ans *= i;
        }
        ans *= a;
        System.out.printf("%d = %d %n", a, ans);
    }
}

public class MoreExtendDemo {
    public static void main(String[] args) {
        GrandSonCMath math2 = new GrandSonCMath();
        math2.getMax(520, 1314);   //呼叫繼承自祖父類別的方法
        math2.getFabonacci(15);    //呼叫繼承自祖父類別的方法
        math2.getFactorial(6);     //呼叫用自已的方法
    }
}