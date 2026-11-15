package listIteratorDemo;
import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		System.out.println("建立alist集合物件...");
		ArrayList<String> alist = new ArrayList<>();
		String[] place = {"蘋果", "水梨", "香蕉", "奇異果", "芭樂"};
		for(String p : place)
			alist.add(p);
		System.out.printf("顯示alist集合物件初始元素...\n");
		System.out.printf("%s\n", alist);
		 	
		ListIterator<String> litera = alist.listIterator();
		System.out.printf("\n修改alist集合物件元素...\n");
		while(litera.hasNext()) {
			litera.next();
			if (litera.nextIndex()==2)
				litera.set("葡萄");
		}
			
		System.out.printf("反向走訪alist集合物件元素...\n");
		while(litera.hasPrevious())
			System.out.printf(" %s", litera.previous());
				
		System.out.printf("\n\n新增alist集合物件元素...\n");
		litera = alist.listIterator(3);
		litera.add("火龍果");
		 
		System.out.printf("顯示alist集合物件最終元素\n");
		System.out.printf("%s\n", alist);
	}
}
