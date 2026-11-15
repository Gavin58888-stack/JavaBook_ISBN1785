package hashMapDemo;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		var hmap = new HashMap<>();
		hmap.put("張三谷", "牧師");
		var post = Map.of("何九山", "教師", "李四斐", "警察", "周六圖", "教師");
		hmap.putAll(post);
		System.out.printf("集合內容：%s\n", hmap);
		System.out.printf("hmap集合的元素個數：%d\n", hmap.size());
		
		System.out.printf("\n加入\"何九山\" ....\n");
		if (hmap.containsKey("何九山"))
			System.out.printf("\"何九山\"已存在，重複加入時職業欄資料會被覆蓋\n");
		hmap.put("何九山", "軍人");
		System.out.printf("\"何九山\"的職業更改為：%s\n", hmap.get("何九山"));
		System.out.printf("加入\"曹五操\" ....\n");
		String name = "曹五操";
		if (hmap.containsKey(name))
			System.out.printf("\" %s \"已存在，不接受更改\n", name);
		else
			hmap.put(name, "律師");
		System.out.printf("移除\"周六圖\" ....\n");
		hmap.remove("周六圖");
		
		System.out.printf("\n集合內容：\n");
		for (Map.Entry e : hmap.entrySet()) {
			System.out.printf("%s = %s\n", e.getKey(), e.getValue());
		}
	}
}
