package writeFile;
import java.io.*;

public class WriteFile {
	public static void main(String[] args) {
		try {
			String fpath = "D:/pair.txt";
			File f = new File(fpath);
			if (! f.exists())
				if(f.createNewFile())
					System.out.printf("%s 檔案建立成功!! \n", fpath);
			
			BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
			fout.write("一盞清茶,可品可飲可溫喉.");
			fout.newLine();
			fout.close();
			System.out.printf("%s 寫檔完成", fpath);
		} catch (IOException e) {
			System.out.printf("輸入檔案路徑有誤!!");
		}
	}
}