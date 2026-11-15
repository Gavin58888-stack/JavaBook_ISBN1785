package ProductDemo01;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;       // 產品編號
    private String name;  // 品名
    private double price; // 單價

    // 建構子 (Constructor)
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 取得產品資訊的字串
    public String toString() {
    	return String.format("編號: %d, 品名: %s, 單價: $%.2f", id, name, price);
    }
}

public class ProductManager {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(); // 建立產品列表

        // 新增 5 筆產品記錄
        products.add(new Product(1, "筆記型電腦", 35000));
        products.add(new Product(2, "智慧型手機", 25000));
        products.add(new Product(3, "無線耳機", 5000));
        products.add(new Product(4, "智慧手錶", 8000));
        products.add(new Product(5, "平板電腦", 18000));

        // 顯示 5 筆產品資料
        System.out.println("產品清單:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
