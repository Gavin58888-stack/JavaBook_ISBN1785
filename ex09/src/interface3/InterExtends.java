package interface3;

interface IMove {
    public void showSpeed();
}

interface IFly {
    public void showFly();
}

interface IAnimal extends IMove, IFly {      //IAnimal介面繼承IMove和IFly介面
    public void showAttack();
}

class AirPlane implements IMove, IFly {     //實作IMove和IFly介面
    public void showSpeed() {
        System.out.printf("飛機每一次加速，會增加 20 km/hr！\n");
    }
    public void showFly() {
        System.out.printf("飛機的最快移動方式，就是飛行！\n");
    }
}

class SiteYaMan implements IAnimal {      //實作IAnimal介面
    public void showSpeed() {
        System.out.printf("賽亞人每一次加速，會增加 30 km/hr！\n");
    }
    public void showFly() {
        System.out.printf("賽亞人飛的最快速度比光速還快！\n");
    }
    public void showAttack() {
        System.out.printf("賽亞人攻擊會使用龜派氣功！\n");
    }
}

public class InterExtends {
    public static void main(String[] args) {
        AirPlane air1 = new AirPlane();   //建立AirPlane類別的air1物件
        air1.showSpeed();                 //呼叫AirPlane類別的showSpeed()方法
        air1.showFly();                   //呼叫AirPlane類別的showFly()方法
        System.out.println();
        SiteYaMan man1 = new SiteYaMan();    //建立SiteYaMan類別的man1物件
        man1.showSpeed();                //呼叫SiteYaMan類別的showSpeed()方法
        man1.showFly();                  //呼叫SiteYaMan類別的showFly()方法
        man1.showAttack();               //呼叫SiteYaMan類別的showAttack()方法
	}
}
