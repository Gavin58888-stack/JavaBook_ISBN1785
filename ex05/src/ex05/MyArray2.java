package ex05;
public class MyArray2 {
	public static void main(String[] args) {
        int[] n = new int[] {42, 67, 90, 32};
        int sum = 0;
        int count = 1;
        for (int num : n) {
            System.out.printf("座號%d ： %d\n", count, num);
            sum += num;
            count++;
        }
        double average = (double) sum / n.length;
        count = 0;
        for (int num : n) {
            if (num > average) {
                count++;
            }
        }
        System.out.printf("平均分數: %.2f\n", average);
        System.out.printf("分數高於平均值的學生人數：%d", count);
	}
}
