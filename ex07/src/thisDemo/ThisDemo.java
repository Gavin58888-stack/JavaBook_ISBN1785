package thisDemo;

class Person {
    private int age;
    public void ShowAge(int age) {
        this.age = age;
        age = age + 4;
        System.out.printf("傳入的 age 變成 %d \n", age);
        System.out.printf("this.age = %d", this.age);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Person Tom = new Person();
        Tom.ShowAge(18);
	}
}
