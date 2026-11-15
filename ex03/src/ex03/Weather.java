package ex03;
import java.util.Scanner;
public class Weather {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入當前氣溫 (°C): ");
		int temperature = scn.nextInt();
		String advice;
		switch (temperature / 10) {
		case 3, 4 -> advice = "天氣炎熱建議穿著輕便服裝！";
		case 2 -> advice = "天氣溫暖適合穿薄長袖或短袖。";
		case 1 -> advice = "天氣涼爽請穿夾克或毛衣。";
		case 0, -1 -> advice = "天氣寒冷請穿厚外套及保暖衣物！";
		default -> advice = "請輸入合理的氣溫！";
		}
		/*
		String advice = switch (temperature / 10) {
		case 3, 4 -> "天氣炎熱建議穿著輕便服裝！";
		case 2 -> "天氣溫暖適合穿薄長袖或短袖。";
		case 1 -> "天氣涼爽請穿夾克或毛衣。";
		case 0, -1 -> "天氣寒冷請穿厚外套及保暖衣物！";
		default -> "請輸入合理的氣溫！";
		};
		String advice = switch (temperature / 10) {
		case 3, 4 : yield "天氣炎熱建議穿著輕便服裝！";
		case 2 : yield "天氣溫暖適合穿薄長袖或短袖。";
		case 1 : yield "天氣涼爽請穿夾克或毛衣。";
		case 0, -1 : yield "天氣寒冷請穿厚外套及保暖衣物！";
		default : yield "請輸入合理的氣溫！";
		};
		*/
		System.out.printf("氣溫%d°C，%s", temperature, advice);
		scn.close();
	}
}