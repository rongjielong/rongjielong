import java.util.Scanner;


public class exercise {

	public static void main(String[] args) {
		int select;
		do{
		System.out.println("��������Ҫ���е������㻹�Ǹ������㣺1.���� 2.����");
		Scanner keyin0=new Scanner(System.in);
		select=keyin0.nextInt();
		}while(select!=1&&select!=2);
		System.out.println("����������Ҫ�洢�Ľ��������");
		Scanner keyin1=new Scanner(System.in);
		double originalMoney=keyin1.nextDouble();
		System.out.println("����������Ҫ�洢����ʱ��(��):");
		Scanner keyin2=new Scanner(System.in);
		int year=keyin2.nextInt();
		System.out.println("����������Ҫ��Ƶ������ʣ�");
		Scanner keyin3=new Scanner(System.in);
		double rate=keyin3.nextDouble();
		double sumValue=originalMoney;
		if(select==1)
		{
			double singleValue=originalMoney*(1+rate*year);
			System.out.println("�����"+year+"���Ĵ���ܶ�Ϊ��"+singleValue);
			do{
				System.out.println("��������Ҫ���㱾��������1.��Ҫ 2.����Ҫ");
				select=new Scanner(System.in).nextInt();
				}while(select!=1&&select!=2);
			if(select==1){
				System.out.println("����������Ҫ�ﵽ�Ľ�");
				singleValue=new Scanner(System.in).nextDouble();
				System.out.println("����������Ҫ�洢����ʱ��(��):");
				year=new Scanner(System.in).nextInt();
				System.out.println("����������Ҫ��Ƶ������ʣ�");
				rate=new Scanner(System.in).nextDouble();
				originalMoney=singleValue/(1+rate*year);
				System.out.println("��Ҫ����"+originalMoney+"Ԫ");
			}
		}
		else
		{
		for(int i = 1 ; i<=year; i++){
			   sumValue= (1+ rate)*sumValue; 
			  
		}
		System.out.println("�����"+year+"���Ĵ���ܶ�Ϊ��"+sumValue);
		do{
			System.out.println("��������Ҫ���㱾��������1.��Ҫ 2.����Ҫ");
			select=new Scanner(System.in).nextInt();
			}while(select!=1&&select!=2);
		if(select==1){
			System.out.println("����������Ҫ�ﵽ�Ľ�");
			sumValue=new Scanner(System.in).nextDouble();
			System.out.println("����������Ҫ�洢����ʱ��(��):");
			year=new Scanner(System.in).nextInt();
			System.out.println("����������Ҫ��Ƶ������ʣ�");
			rate=new Scanner(System.in).nextDouble();
			for(int i = 1 ; i<=year; i++){
				   sumValue= sumValue/(1+ rate); 
				  
			}
			originalMoney=sumValue;
			System.out.println("��Ҫ����"+originalMoney+"Ԫ");
		}
		}

	}

}