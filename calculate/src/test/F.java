package test;

public class F {
	public double test6(double sumValue,double originalMoney,int year){
		double rate = 0;
		for (; Math.log(sumValue / originalMoney) / Math.log(rate + 1) > year; rate = rate + 0.0001) {
			continue;
		}
		
		System.out.println("������ӦΪ��" + rate);
		return rate;
	}

}
