package finalDemo2;

class Ccar {
    private final int SPEED = 120 ;
    public final void showBigSpeed(String s)  {
        System.out.printf("%s 最大速度是 %d 公里！\n", s, SPEED);
    }
}

class PiliCcar extends Ccar {
    public void showBigSpeed(String s, int n) {
        System.out.printf("%s 加強後最大速度是 %d 公里！\n", s, n);
    }
}

public class FinalDemo2 {
    public static void main(String[] args) {
        Ccar car1 = new Ccar();
        car1.showBigSpeed("car1");        //呼叫Ccar父類別的showBigShow()
        PiliCcar car2 = new PiliCcar();
        car2.showBigSpeed("car2");        //呼叫Ccar父類別的showBigShow()
        car2.showBigSpeed("car2", 200);   //呼叫PiliCcar子類別的showBigShow()
    }
}