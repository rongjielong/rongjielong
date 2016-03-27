package test;

public class C {
	public double test3(double sumValue,int year,double rate){
		for (int i = 1; i <= year; i++) {
			sumValue = (1 + rate) * sumValue;

		}
		System.out.println("存入第" + year + "年后的存款总额为：" + sumValue);
		return sumValue;
	}

}
