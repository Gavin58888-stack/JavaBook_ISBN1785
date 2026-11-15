package staticDemo;

class A {
    public static int a = 8;
    public static int b;

    public static void show() {
        b = 36;
        System.out.printf("b 的值是: %d", b);
    }
}

class B extends A {
    /* 父類別的show方法為static，所以子類別無法覆蓋
    public void show() {
        System.out.printf("這是子類別的方法 \n");
    }
    */
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.printf("類別 A 中 a 的值是: %d \n", A.a);
        System.out.printf("現在要直接呼叫類別 A 中的方法成員show() \n");
        A.show();
    }
}
