package constructorExtend;

class Line {
    protected int leng = 6;     // 長度　
    Line() {
        System.out.printf("直線長度 = %d \n", leng);
    }
}
   
class Rectangle extends Line {
	protected int wide = 3;     // 寬度
	Rectangle() {
	    System.out.printf("矩形面積 = %d \n", leng * wide);
	}
}

class Cube extends Rectangle {
	protected int high = 5;     // 高度
	Cube() {
	    System.out.printf("立方體體積 = %d \n", leng * wide * high);
	}
}
   
public class ConstructorExtend {
    public static void main(String[] args) {
        new Cube();            // 採匿名物件的方式來建立物件實體
    }
}
