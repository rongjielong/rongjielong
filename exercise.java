import java.util.Scanner;


public class exercise {

	public static void main(String[] args) {
		System.out.println("����������Ҫ�洢�Ľ��������");
		Scanner keyin1=new Scanner(System.in);
		double originalMoney=keyin1.nextDouble();
		System.out.println("����������Ҫ�洢����ʱ��(��)��");
		Scanner keyin2=new Scanner(System.in);
		int year=keyin2.nextInt();
		System.out.println("����������Ҫ��Ƶ������ʣ�");
		Scanner keyin3=new Scanner(System.in);
		double rate=keyin3.nextDouble();
		double sumValue=originalMoney;
		for(int i = 1 ; i<=year; i++){
			   sumValue= (1+ rate)*sumValue; 
			  
		}
		System.out.println("�����"+year+"���Ĵ���ܶ�Ϊ��"+sumValue);

	}

}
