import java.util.Scanner;


public class exercise {

	public static void main(String[] args) {
		System.out.println("请输入您想要存储的金额数量：");
		Scanner keyin1=new Scanner(System.in);
		double originalMoney=keyin1.nextDouble();
		System.out.println("请输入您想要存储金额的时间(年)；");
		Scanner keyin2=new Scanner(System.in);
		int year=keyin2.nextInt();
		System.out.println("请输入您想要设计的年利率：");
		Scanner keyin3=new Scanner(System.in);
		double rate=keyin3.nextDouble();
		double sumValue=originalMoney;
		for(int i = 1 ; i<=year; i++){
			   sumValue= (1+ rate)*sumValue; 
			  
		}
		System.out.println("存入第"+year+"年后的存款总额为："+sumValue);

	}

}
