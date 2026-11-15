package arrayListDemo;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("～東部旅遊夜宿規劃～");
		var night = new ArrayList<>();
		//ArrayList<String> night = new ArrayList<>();
		var place = List.of("宜蘭", "花蓮", "天祥", "花蓮", "台東");
		for (String p : place)
			night.add(p);
		System.out.printf("初期規劃夜宿地點：%s\n", night);
		System.out.printf("初期規劃夜宿天數：%d\n", night.size());
		night.add("知本");
		night.add(4, "池上");
		System.out.printf("修訂後夜宿地點：%s\n", night);
		System.out.printf("夜宿天祥在第幾天：%d\n",night.indexOf("天祥")+1);
		System.out.printf("刪除花蓮第一個夜宿...\n");
		night.remove(night.indexOf("花蓮"));
		
		System.out.printf("\n確定夜宿天數：%d\n", night.size());
		System.out.printf("～確定夜宿表列～\n");
		for (int i = 0; i < night.size(); i++)
			System.out.printf("第 %d 天夜宿地點：%s\n", i+1, night.get(i));
	}
}
