package ex05;
public class MyArray1 {
	public static void main(String[] args) {
		int[] n = new int[] {42, 67, 90, 32};
		int sum = 0;
		for (int i = 0; i < 4; i ++) {
			System.out.printf("座號%d ： %d\n", ( i + 1 ), n[i]);
			sum += n[i];
		}
		double average = (double) sum / 4;
		int count = 0;
        for (int i = 0; i < 4; i++) {
            if (n[i] > average) {
            	count += 1;
            }
        }
        System.out.printf("平均分數: %.2f\n", average);
        System.out.printf("分數高於平均值的學生人數：%d", count);
	}
}
