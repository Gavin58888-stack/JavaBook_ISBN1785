package polymorphism2;

import java.util.Scanner;

interface CFruit {          //定義CFruit介面
	int Spend();            //宣告花費金額Spend()方法
}

class CApple implements CFruit {           //CApple類別實作CFruit介面
    private int number, price;
    CApple(int number, int price) {
        this.number = number;
        this.price = price;
    }
    public int Spend() {                  //實作Spend()方法
        return number * price;
    }
}

class CTomato implements CFruit {         //CTomato類別實作CFruit介面
    private float kg;
    private int price;
    CTomato(float kg, int price) {
        this.kg = kg;
        this.price = price;
    }
    public int Spend() {                 //實作Spend()方法
        return (int)(kg * price);
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
	    CFruit fruit;                //宣告CFruit介面的參考變數fruit
	    CApple apple;                //宣告CApple類別的物件apple
	    //CTomato tomato;            //宣告CTomato類別的物件tomato
	    int total = 0;               //存放累計的金額
			
		Scanner scn = new Scanner(System.in);   //建立scn物件接受輸入資料
		while (true) {
		    System.out.printf("結算的種類? (1.個數  2.公斤  3.離開)：");
		    int item = scn.nextInt();
		    if (item == 1) {
		        System.out.printf("購買幾顆？ ");
		        int number = scn.nextInt();
		        System.out.printf("單價(元)？ ");
		        int price = scn.nextInt();
		        apple = new CApple(number, price);  //建立apple物件
		        fruit = apple;                      //fruit指向apple物件
		    } else if (item == 2) {
		        System.out.printf("購買幾公斤？ ");
		        float kg = scn.nextFloat();
		        System.out.printf("單價(元)？ ");
		        int price = scn.nextInt();
		        fruit = new CTomato(kg, price);   //fruit指向CTomato類別物件
		    } else {
		        scn.close();
		        break;
		    }
		    int sum = fruit.Spend();       //實作Spend()方法
		    total += sum;           
		    System.out.printf("小計：%d元\t\t累計：%d元 \n", sum, total);
		    System.out.printf("------------------------------------\n");
        }
    }
}
