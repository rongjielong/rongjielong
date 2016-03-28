package test;

public class H {
	public double test8(double sumValue,double rate,int year){
		
		for (int i = 1; i <= year; i++) {
			sumValue = (1 + rate) * sumValue;

		}
		
		double returnPay=sumValue/(year*12);
		System.out.println("每个月应该偿还"+returnPay);
		return returnPay;
	}

}
