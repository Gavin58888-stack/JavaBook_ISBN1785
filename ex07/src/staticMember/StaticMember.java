package staticMember;

class Student {
 	public static int count = 0;  	// 公有類別變數
    public int num = 0;           	// 公有實體變數
    private int tot;

    Student(){
        count++;
        num++;
    }

    public int GetTot(int chi,int eng) {       
        tot = chi + eng;
        return tot; 
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.printf("s1.num = %d \n", s1.num);   
        System.out.printf("第 %d 位, ", Student.count);
        System.out.printf("總分 = %d \n\n", s1.GetTot(70, 95));
        
        Student s2 = new Student();
        System.out.printf("s2.num = %d \n", s2.num);    
        System.out.printf("第 %d 位, ", Student.count);
        System.out.printf("總分 = %d", s2.GetTot(130, 114));  
 	}
}
