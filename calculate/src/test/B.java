package test;

public class B {
	public static double singleValue;
	public double test2(double originalMoney,int year,double rate){
		singleValue = originalMoney * (1 + rate * year);
		System.out.println("�����" + year + "���Ĵ���ܶ�Ϊ��" + singleValue);
		return singleValue;
	}

}
