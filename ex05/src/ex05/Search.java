package ex05;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] aName = { "Jerry", "Jack", "Winnie", "Max", "Amy",
		                   "Peter", "Tony" };
		System.out.print("排序前: ");
		for (int i = 0; i < aName.length; i++)
			System.out.print(aName[i] + ", ");
		System.out.println();
		Arrays.sort(aName);
		System.out.print("排序後: ");
		for (int i = 0; i < aName.length; i++)
			System.out.printf("%s, ", aName[i]);
		System.out.println();
		System.out.print("請輸入搜尋值: ");
		String sName = scn.nextLine();
		int find = -1;
		if ((find = Arrays.binarySearch(aName, sName)) > -1) {
			System.out.printf("找到 %s 位於註標 %d 處", sName, find);
		} else
			System.out.printf("找不到%s", sName);
		scn.close();
	}
}
