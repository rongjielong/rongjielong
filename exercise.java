import java.util.Scanner;


public class exercise {

	public static void main(String[] args) {
		int select;
		do{
		System.out.println("请问您想要进行单利计算还是复利计算：1.单利 2.复利");
		Scanner keyin0=new Scanner(System.in);
		select=keyin0.nextInt();
		}while(select!=1&&select!=2);
		System.out.println("请输入您想要存储的金额数量：");
		Scanner keyin1=new Scanner(System.in);
		double originalMoney=keyin1.nextDouble();
		System.out.println("请输入您想要存储金额的时间(年):");
		Scanner keyin2=new Scanner(System.in);
		int year=keyin2.nextInt();
		System.out.println("请输入您想要设计的年利率：");
		Scanner keyin3=new Scanner(System.in);
		double rate=keyin3.nextDouble();
		double sumValue=originalMoney;
		if(select==1)
		{
			double singleValue=originalMoney*(1+rate*year);
			System.out.println("存入第"+year+"年后的存款总额为："+singleValue);
			do{
				System.out.println("请问您想要计算本金问题吗：1.需要 2.不需要");
				select=new Scanner(System.in).nextInt();
				}while(select!=1&&select!=2);
			if(select==1){
				System.out.println("请输入您想要筹到的金额：");
				singleValue=new Scanner(System.in).nextDouble();
				System.out.println("请输入您想要存储金额的时间(年):");
				year=new Scanner(System.in).nextInt();
				System.out.println("请输入您想要设计的年利率：");
				rate=new Scanner(System.in).nextDouble();
				originalMoney=singleValue/(1+rate*year);
				System.out.println("需要本金"+originalMoney+"元");
			}
		}
		else
		{
		for(int i = 1 ; i<=year; i++){
			   sumValue= (1+ rate)*sumValue; 
			  
		}
		System.out.println("存入第"+year+"年后的存款总额为："+sumValue);
		do{
			System.out.println("请问您想要计算本金问题吗：1.需要 2.不需要");
			select=new Scanner(System.in).nextInt();
			}while(select!=1&&select!=2);
		if(select==1){
			System.out.println("请输入您想要筹到的金额：");
			sumValue=new Scanner(System.in).nextDouble();
			System.out.println("请输入您想要存储金额的时间(年):");
			year=new Scanner(System.in).nextInt();
			System.out.println("请输入您想要设计的年利率：");
			rate=new Scanner(System.in).nextDouble();
			for(int i = 1 ; i<=year; i++){
				   sumValue= sumValue/(1+ rate); 
				  
			}
			originalMoney=sumValue;
			System.out.println("需要本金"+originalMoney+"元");
		}
		}

	}

}