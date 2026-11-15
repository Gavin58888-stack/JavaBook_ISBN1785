package treeSetDemo;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		var tset = new TreeSet<>();
		//TreeSet<String> tset = new TreeSet<>();
		String[] character = {"box", "dog","help","time","ox","map", "apple","flag", "cat", "banana", "pen", "window","computer"};
		for(String s : character)
		    tset.add(s);
		System.out.printf("物件內元素的內容：\n");
		System.out.printf("  " + tset +"\n");
		System.out.printf("第一個元素內容為：%s\n", tset.first());
		System.out.printf("最後一個元素內容：%s\n", tset.last());
		Scanner keyin = new Scanner(System.in);
		 
		String st1;
		while (true) {
			System.out.printf("\n請輸入其中一個英文單字？ ");
			st1 = keyin.nextLine();
		    if(tset.contains(st1)) 
		    	break;
	    	System.out.printf("  %s 單字不在集合物件中\n", st1);	
	    }
		System.out.printf("  從 %s 單字開始排列的元素內容：\n", st1);
		System.out.printf(tset.tailSet(st1).toString());
	    keyin.close();
	}	
}