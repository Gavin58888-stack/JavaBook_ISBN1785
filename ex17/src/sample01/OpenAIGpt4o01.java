package sample01;

import java.io.*;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONArray;
import java.nio.charset.StandardCharsets;

public class OpenAIGpt4o01 {

    // 請替換成你的 OpenAI API Key
    private static final String API_KEY = "你的OpenAI API金鑰";
    private static final String ENDPOINT = "https://api.openai.com/v1/responses";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入提示（Prompt）：");
        String prompt = scanner.nextLine();

        String reply = callOpenAIGpt4o(prompt);
        System.out.println("GPT-4o 回應：\n" + reply);
    }

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
}