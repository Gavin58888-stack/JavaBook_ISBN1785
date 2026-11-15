package iteratorDemo;
import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		//建立tset集合物件
		TreeSet<Integer> tset = new TreeSet<>();
		System.out.printf("將1~50的整數存入集合物件中...\n");
		for(int i=1; i<=50; i++)
			tset.add(i);
		System.out.printf("開始時，集合物件內元素個數為：%d\n", tset.size());
		//建立走訪器物件itera
		Iterator<Integer> itera = tset.iterator();
		System.out.printf("非質數移除中...\n");
		itera.next();
		itera.remove();                 //1不是質數,先移除
		while(itera.hasNext()) {
			int num = itera.next();
			for(int j=2; j<num; j++) {
				if(num % j == 0) {
					itera.remove();           //因有其他因數,故非質數
					break;
				}
			}
		}
		System.out.printf("非質數移除完畢\n");
		System.out.printf("最後，集合物件內元素個數為：%d\n", tset.size());
		System.out.printf("1~50的質數有：%s\n", tset);
	}
}
