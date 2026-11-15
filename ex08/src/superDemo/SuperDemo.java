package superDemo;

class CScore {
    private int chia, math;

    CScore() {
        chia = 0; math = 0;
    }

    CScore(int chia, int math) {
        this.chia = chia;
        this.math = math;
    }

    public void showScore() {
        System.out.printf("國文：%d\t數學：%d", this.chia, this.math);
    }
}

class SonCScore extends CScore {
    private int eng;

    SonCScore() {
        super();       //呼叫CScore父類別的CScore()建構式
        eng = 0;
    }
	
    SonCScore(int chia, int math, int eng) {
        //呼叫CScore父類別的CScore(int chia, int math)建構式
        super(chia, math);
        this.eng = eng;
    }
	
    public void showScore() {
        super.showScore();   //呼叫父類別的showScore方法
        System.out.printf("\t英語：%d", this.eng);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        CScore Peter = new CScore(81, 73);
        Peter.showScore();
        System.out.println();
        SonCScore Tom = new SonCScore(79, 65, 90);
        Tom.showScore();
	}
}
