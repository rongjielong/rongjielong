package test;

public class D {
	double test4(double singleValue,double rate,int year){
		double originalMoney = singleValue / (1 + rate * year);
		System.out.println("��Ҫ����" + originalMoney + "Ԫ");
		return originalMoney;
	}

}
