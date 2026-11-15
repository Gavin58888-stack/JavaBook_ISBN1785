package interface1;

interface ILimit {                          // 定義ILimit介面
    final int HIGH = 110;   	            // 最高速限制介面常數
    final int LOW = 60; 		            // 最低速限制介面常數
    public abstract String Drive();         // 只宣告方法，無程式碼
}

class Car implements ILimit {           //Car類別實作ILimit介面
    private int speed;
    Car(int speed) {
    	this.speed = speed;
    }
	public String Drive() {            //實作ILimit介面的Drive()方法
        if (speed > HIGH)
            return "目前車速 " + speed + " km/hr，請減速";
        else if (speed < LOW)
            return "目前車速 " + speed + " km/hr，請加快";
        else
            return "目前車速 " + speed + " km/hr，請保持";
    }
}

class Truck implements ILimit {         //Truck類別實作ILimit介面
	private int speed;
    Truck(int speed) {
    	this.speed = speed;
    }
	public String Drive() {             //實作ILimit介面的Drive()方法
        if (speed > HIGH)
            return "目前超速行駛，會影響交通安全";
        else if (speed < LOW)
            return "目前低速行駛，會阻塞交通";
        else
            return "目前正常行駛，保持距離";
    }
}

public class Practice {
    public static void main(String[] args) {
	    Car c1 = new Car(90);
		System.out.printf("c1小客車：%s \n", c1.Drive());
	    Truck t1 = new Truck(50);
		System.out.printf("t1大貨車：%s \n", t1.Drive());
	}
}
