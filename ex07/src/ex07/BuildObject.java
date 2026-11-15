package ex07;                       //宣告程式檔的類別置於ex07套件內

public class BuildObject {          //主類別
	public static void main(String[] args) {   //主程式
	    Rectangle rec1;             //宣告rec1物件　　　
        rec1 = new Rectangle();   	//建立rec1物件
        rec1.high = 10;             //設定rec1物件的high屬性值
        rec1.wide = 5.6;           //設定rec1物件的wide屬性值
        rec1.calArea();             //呼叫rec1物件的方法
        double r1_peri;       		//宣告變數r1_peri　
        r1_peri = rec1.getPeri(rec1.high, rec1.wide);  //傳回周長值指給變數
        
        System.out.printf("*** 矩形物件rec1 ***\n");
    	System.out.printf("高度 = %.1f \n", rec1.high);
    	System.out.printf("寬度 = %.1f \n", rec1.wide);
    	System.out.printf("面積 = %.1f \n", rec1.area);
    	System.out.printf("周長 = %.1f \n", r1_peri);
	}
}
