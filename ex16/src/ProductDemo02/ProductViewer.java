package ProductDemo02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// 產品類別
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

// 產品視窗
public class ProductViewer extends JFrame {
    private List<Product> products; // 產品列表
    private int currentIndex = 0; // 當前顯示的產品索引

    private JTextField idField, nameField, priceField;
    private JButton prevButton, nextButton;

    public ProductViewer() {
        setTitle("產品瀏覽器");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // 建立 5 筆產品
        products = new ArrayList<>();
        products.add(new Product(1, "筆記型電腦", 35000));
        products.add(new Product(2, "智慧型手機", 25000));
        products.add(new Product(3, "無線耳機", 5000));
        products.add(new Product(4, "智慧手錶", 8000));
        products.add(new Product(5, "平板電腦", 18000));

        // 介面元件
        add(new JLabel("編號:"));
        idField = new JTextField();
        idField.setEditable(false);
        add(idField);

        add(new JLabel("品名:"));
        nameField = new JTextField();
        nameField.setEditable(false);
        add(nameField);

        add(new JLabel("單價:"));
        priceField = new JTextField();
        priceField.setEditable(false);
        add(priceField);

        prevButton = new JButton("上一筆");
        nextButton = new JButton("下一筆");

        add(prevButton);
        add(nextButton);

        // 顯示第一筆產品
        updateProductInfo();

        // 設定按鈕監聽事件
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentIndex > 0) {
                    currentIndex--;
                    updateProductInfo();
                }
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentIndex < products.size() - 1) {
                    currentIndex++;
                    updateProductInfo();
                }
            }
        });

        setVisible(true);
    }

    // 更新顯示的產品資訊
    private void updateProductInfo() {
        Product product = products.get(currentIndex);
        idField.setText(String.valueOf(product.getId()));
        nameField.setText(product.getName());
        priceField.setText("$" + product.getPrice());
    }

    public static void main(String[] args) {
        new ProductViewer();
    }
}