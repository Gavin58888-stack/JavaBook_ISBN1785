package myException;

class BankException extends Exception {      // BankException繼承Exception
	public String toString() {  // 覆寫Throwable類別的toString()方法
		return "發生 BankException 類別的例外!";
	}
	public String getMessage() {  // 覆寫Throwable類別的getMessage()方法
		return "帳戶餘額不可以是負數!";
	}
	public void showMessage() {  // showMessage()方法是自定的方法
			System.out.println("設定帳號請小心，發生例外了!");
	}
}

class Bank {
	String accno;
	String name;
	long account;
	void setAcc(String cno, String cname, long m) throws BankException {
		System.out.printf("進行 %s 開戶作業", cname);
		if(m < 0) {
			throw new BankException(); //抛出BankException自定例外類別的物件實體
		}
		else {
			accno = cno;
			name = cname;
			account = m;
		}
	}
	void showData() {
		System.out.printf("帳戶編號：%s\n", accno);
		System.out.printf("客戶姓名：%s\n", name);
		System.out.printf("帳戶餘額：%s\n", account);
	}
}
public class MyException {

	public static void main(String[] args) {
		try {
			Bank Jack = new Bank();
			Jack.setAcc("A0001", "Jack", 90000);
			Jack.showData();
			Bank Lung = new Bank();
			Lung.setAcc("B0001", "Lung", -900);
			Lung.showData();  //此行不會執行 
		}
		catch (BankException e) { //捕捉自行定義的BankException類別例外
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.showMessage();
		}
	}
}
