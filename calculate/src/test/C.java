package test;

public class C {
	public double test3(double sumValue,int year,double rate){
		for (int i = 1; i <= year; i++) {
			sumValue = (1 + rate) * sumValue;

		}
		System.out.println("�����" + year + "���Ĵ���ܶ�Ϊ��" + sumValue);
		return sumValue;
	}

}
