package ex02;
public class Ex02_02 {
	public static void main(String[] args) {
		final int BASE_FARE = 75;           // 宣告起跳價為常數
		final int FARE_PER_KM = 20;         // 宣告每公里費用為常數
		System.out.println("距離12公里，總車資：" + (BASE_FARE + (FARE_PER_KM * 12)) + "元");
	}
}