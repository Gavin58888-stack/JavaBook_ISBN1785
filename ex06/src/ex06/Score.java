package ex06;

public class Score {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.printf(" 座號 %d 同學成績：%s\n", (i + 1), args[i]);
	}
}
