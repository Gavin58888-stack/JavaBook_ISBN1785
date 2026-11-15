package overrideDemo;

class CMath {
    public void getMax(int a, int b) {
        int bigNum;
        if (a > b) 
            bigNum = a;
        else 
            bigNum = b;
        //System.out.println(a + " 和 " + b + " 的最大數為 " + bigNum);
        System.out.printf("%d 和 %d 的最大數為 %d \n",a ,b, bigNum);
    }
}

class SonCMath extends CMath {
    public void getMax(int a, int b) {
        if (a > b)
            System.out.printf("%d 和 %d 的最大數為 %d \n",a, b, a);
        else if(a < b)
            System.out.printf("%d 和 %d 的最大數為 %d \n",a, b, b);
        else
            System.out.printf("%d 和 %d 一樣大 \n", a, b);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        CMath math3 = new CMath();
        math3.getMax(57, 75);         //呼叫CMath父類別的getMax()方法
        math3.getMax(128, 128);       //呼叫CMath父類別的getMax()方法
        System.out.printf("---------------------------------\n");
        SonCMath math4 = new SonCMath();
        math4.getMax(57, 75);         //呼叫SonCMath子類別的getMax()方法
        math4.getMax(128, 128);        //呼叫SonCMath子類別的getMax()方法
    }
}
