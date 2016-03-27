package test;

public class B {
	public static double singleValue;
	public double test2(double originalMoney,int year,double rate){
		singleValue = originalMoney * (1 + rate * year);
		System.out.println("存入第" + year + "年后的存款总额为：" + singleValue);
		return singleValue;
	}

}
