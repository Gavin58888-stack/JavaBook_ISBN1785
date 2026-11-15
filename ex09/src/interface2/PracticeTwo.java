package interface2;

interface ILimit {
    int HIGH = 110;   	     //最高速限制
    int LOW = 60;      	     //最低速限制
    String Drive();          
}

interface IDistance {
    void Process(int min);  //行駛過程
    void Keep();            //保持距離
}

class Car implements ILimit, IDistance {
    private int speed;
	Car(int speed) {
	    this.speed = speed;
	}
	public String Drive() {
        if (speed > HIGH)
            return "目前平均車速為 " + speed + " km/hr，請減速。";
       else if (speed < LOW)
            return "目前平均車速為 " + speed + " km/hr，請加快。";
       else
            return "目前平均車速為 " + speed + " km/hr，請保持。";
    }
    public void Process(int min) {
        double leng = speed * (float)min / 60;
        System.out.printf("已行駛 %d 分，跑了 %.2f 公里 \n", min, leng);
    }
    public void Keep() {
        System.out.printf("請與前車保持 %d 公尺以上距離 \n", (int)(speed/2));
    }
}

public class PracticeTwo {
    public static void main(String[] args) {
	    Car c1 = new Car(140);
		System.out.println("c1小客車：");
		System.out.println(c1.Drive());
		c1.Process(2);
		c1.Keep();
    }	
}
