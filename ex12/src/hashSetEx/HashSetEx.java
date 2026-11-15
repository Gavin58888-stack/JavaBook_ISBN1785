package hashSetEx;
import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		var hset = new HashSet<>();
		//HashSet<Integer> hset = new HashSet<>();
		int order = 1;
		int num;
		Scanner keyin = new Scanner(System.in);
		System.out.printf("請輸入四個 1~49 不重複的整數....\n");
		while (order <= 4) {
		    System.out.printf(" 第 %d 個整數？ ", order);
		    try {
		    	num = Integer.parseInt(keyin.nextLine());
		    } catch (NumberFormatException ex) {
		        System.out.printf("  請輸入數值！\n");
		        continue;
		    }
		    if (num<1 || num>49) {
		    	System.out.printf("  整數輸入範圍：1~49，請重新輸入！\n");
		    	continue;
		    }	
		    if (hset.add(num))
		        order++;
		    else
		        System.out.printf("  整數 %d 重複輸入！\n", num);
        }
		System.out.printf("四個整數分別為：\n");
		System.out.println(hset);
		
		System.out.printf("輸入要找尋的整數？ ");
		int findNum1 = keyin.nextInt();
		if (hset.contains(findNum1))
		    System.out.printf("  整數 %d 存在集合物件中\n", findNum1);
		else
		    System.out.printf("  整數 %d 不在集合物件中\n", findNum1);
				 
		System.out.printf("輸入要刪除的整數？ ");
		int findNum2 = keyin.nextInt();
		if (hset.remove(findNum2))
		    System.out.printf("  整數 %d 已刪除\n", findNum2);
		else
		    System.out.printf("  整數 %d 不在集合物件中\n", findNum2);
		 
		System.out.printf("目前集合物件的元素個數為：%d", hset.size());
		keyin.close();
	}
}
