package sample02;

import java.io.*;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONArray;
import java.nio.charset.StandardCharsets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenAIGpt4o02 extends JFrame {
	
    // 請替換成你的 OpenAI API Key
    private static final String API_KEY = "你的OpenAI API金鑰";
    private static final String ENDPOINT = "https://api.openai.com/v1/responses";
    
    public static String callOpenAIGpt4o(String prompt) throws IOException {
        URL url = new URL(ENDPOINT);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + API_KEY);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        // 準備 JSON 請求體
        JSONObject systemMessage = new JSONObject();
        systemMessage.put("role", "developer");
        systemMessage.put("content", "你是一位熱心又聰明的助理");

        JSONObject userMessage = new JSONObject();
        userMessage.put("role", "user");
        userMessage.put("content", prompt);

        JSONArray messages = new JSONArray();
        messages.put(systemMessage);
        messages.put(userMessage);

        JSONObject requestBody = new JSONObject();
        requestBody.put("model", "gpt-4o");  // 使用 GPT-4o 模型
        requestBody.put("input", messages);

        // 傳送 POST 請求
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = requestBody.toString().getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }

        // 讀取回應
        StringBuilder response = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line.trim());
            }
        }

        // 解析 JSON 回應
        JSONObject jsonResponse = new JSONObject(response.toString());
        return jsonResponse
                .getJSONArray("output").getJSONObject(0)
                .getJSONArray("content").getJSONObject(0)
                .getString("text");
    }
	
	//宣告questionTextArea問題多行文字欄位
    private JTextArea questionTextArea;	
    //宣告answerTextArea回答多行文字欄位
    private JTextArea answerTextArea;	
    //建構式
    public OpenAIGpt4o02() {
        setTitle("ChatGPT聊天機器人");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 建立問題多行文字欄
        JLabel questionLabel = new JLabel("問題：");
        questionTextArea = new JTextArea(5, 30);
        questionTextArea.setLineWrap(true);
        JScrollPane questionScrollPane = new JScrollPane(questionTextArea);

        // 建立回答多行文字欄
        JLabel answerLabel = new JLabel("回答：");
        answerTextArea = new JTextArea(5, 30);
        answerTextArea.setLineWrap(true);
        answerTextArea.setEditable(false);
        JScrollPane answerScrollPane = new JScrollPane(answerTextArea);

        // 建立確定按鈕
        JButton confirmButton = new JButton("確定");
        // 當按鈕被按下時，將問題內容傳送給OpenAI API
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)  {  
            	try {
                	String prompt = questionTextArea.getText(); //取得問題
                    String reply = callOpenAIGpt4o(prompt);
                    answerTextArea.setText(reply);
            	}catch(IOException ex) {
            		answerTextArea.setText("錯誤：" + ex.getMessage());
            	}

            }
        });

        // 將所有欄位加入到視窗中
        JPanel panel = new JPanel();
        panel.add(questionLabel);
        panel.add(questionScrollPane);
        panel.add(answerLabel);
        panel.add(answerScrollPane);
        panel.add(confirmButton);
        add(panel);
        setBounds(300, 300, 400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
    	//建立視窗程式
    	OpenAIGpt4o02 example = new OpenAIGpt4o02();
    }
}


