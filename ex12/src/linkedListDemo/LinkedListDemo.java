package linkedListDemo;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		var showgirl = List.of("Angel", "路小璇", "培培", "Wendy", "芭芭樂");
		var ary = new ArrayList<>();
		for(String g : showgirl)
		    ary.add(g);
		System.out.printf("SHOWGIRL進場順序(串列元素前後順序)：\n");
		for(int i=0; i<ary.size(); i++)
			System.out.printf("第 %d 位：%s\n", i+1, ary.get(i));
		
		var queue = new LinkedList<>(ary);
		System.out.printf("\n佇列方式出場：先進先出\n");
		for(int j=queue.size()-1; j>=0; j--){
			System.out.printf(" %s", queue.getFirst());
			queue.removeFirst();
		}
						 
		var stack = new LinkedList<>(ary);
		System.out.printf("\n\n堆疊方式出場：後進先出\n");
		while(true){
			System.out.printf(" %s", stack.removeLast());
			if(stack.isEmpty()) break;
		}
	}
}
