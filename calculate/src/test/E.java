package test;

public class E {
	public double test5(double sumValue,double rate,int year){
		for (int i = 1; i <= year; i++) {
			sumValue = sumValue / (1 + rate);

		}
		double originalMoney = sumValue;
		System.out.println("需要本金" + originalMoney + "元");
		return originalMoney;
	}

}
