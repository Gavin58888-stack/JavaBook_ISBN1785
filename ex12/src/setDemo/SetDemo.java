package setDemo;
import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
	    var hset = new HashSet<>();
		//HashSet<String> hset = new HashSet<>();
		//Set<String> hset = new HashSet<>();
		hset.add("宙斯");              //將字串常值資料存入集合物件中
		//字串集合
		var babil = Set.of("阿波羅", "宙斯", "雅典娜", "波塞頓", "黑帝斯"); 
		//字串陣列
		//String[] babil = {"阿波羅", "宙斯", "雅典娜", "波塞頓", "黑帝斯"}; 
		for (String p : babil)     //將字串集合元素資料存入集合物件中
		    hset.add(p);
		String myBabil = "海克力斯";
		hset.add(myBabil);              //將字串變數資料存入集合物件中
		System.out.println("希臘神：" + hset);  //顯示集合中的所有元素內容
	}
}
