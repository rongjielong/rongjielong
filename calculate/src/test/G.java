package test;

public class G {
	public double test7(double originalMoney,double rateMonth,int month){
		double sumValue=0;
		for (int i = 1; i <= month; i++) {
			sumValue = (1 + rateMonth) * (sumValue+originalMoney);

		}
		System.out.println(""+month+"个月后资产总值将变为："+sumValue);
		return sumValue;
	}

}
