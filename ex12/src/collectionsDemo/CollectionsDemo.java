package collectionsDemo;
import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		var data = List.of("Angel", "路小璇", "培培", "Wendy", "芭芭樂");
		for(String p : data)
			alist.add(p);
		System.out.printf("顯示alist集合物件初始元素...\n");
		System.out.printf("%s\n", alist);
		 
		Collections.sort(alist);
		System.out.printf("\n排序後的元素...\n");
		System.out.printf("%s\n", alist);
		 
		Collections.reverse(alist);
		System.out.printf("\n反轉排列的元素...\n");
		System.out.printf("%s\n", alist);
	}
}