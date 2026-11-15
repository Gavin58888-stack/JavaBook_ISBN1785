package treeMapDemo;
import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		var tmap = new TreeMap<>();
		tmap.put(260, "宜蘭");
		tmap.put(970, "花蓮");
		tmap.put(500, "彰化");
		tmap.put(900, "屏東");
		tmap.put(600, "嘉義");
		System.out.printf("集合內容：%s\n", tmap);
		System.out.printf("集合的元素個數：%d\n", tmap.size());
		int key = (int) tmap.firstKey();
		System.out.printf("集合的第一個郵遞區號：%d\n", key);
		System.out.printf("集合的第一個地名：%s\n", tmap.get(key));
		System.out.printf("集合的最後一個郵遞區號：%d\n", tmap.lastKey());
		System.out.printf("集合的最後一個地名：%s\n", tmap.get(tmap.lastKey()));
		System.out.printf("郵遞區號大於等於 600 的元素集合：%s", tmap.tailMap(600));
	}
}