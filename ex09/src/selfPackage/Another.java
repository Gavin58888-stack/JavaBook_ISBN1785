package selfPackage;

public class Another {
	void show_a() {           //預設存取權限
		System.out.printf("這是selfPackage,修飾子:無(預設) \n");
	}
	public void show_b() {    //公用存取權限
		System.out.printf("這是selfPackage,修飾子:public \n");
	}
	protected void show_c() { //保護存取權限
		System.out.printf("這是selfPackage,修飾子:protected \n");
	}
	private void show_d() {   //私有存取權限
		System.out.printf("這是selfPackage,修飾子:private \n");
	}

}
