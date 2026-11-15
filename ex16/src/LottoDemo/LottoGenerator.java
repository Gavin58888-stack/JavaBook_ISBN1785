package LottoDemo;

import java.util.*;

public class LottoGenerator {
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>(); // 使用 Set 確保數字不重複
        Random random = new Random(); // 創建隨機數產生器

        while (lottoNumbers.size() < 6) { // 生成 6 個不同的號碼
            int number = random.nextInt(49) + 1; // 產生 1~49 之間的隨機數
            lottoNumbers.add(number); // 加入 Set (若重複則自動忽略)
        }

        List<Integer> sortedNumbers = new ArrayList<>(lottoNumbers); // 將 Set 轉為 List 方便排序
        Collections.sort(sortedNumbers); // 由小到大排序

        System.out.println("本期大樂透號碼: " + sortedNumbers); // 輸出結果
    }
}

