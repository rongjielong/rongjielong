package test;

public class G {
	public double test7(double originalMoney,double rateMonth,int month){
		double sumValue=0;
		for (int i = 1; i <= month; i++) {
			sumValue = (1 + rateMonth) * (sumValue+originalMoney);

		}
		System.out.println(""+month+"���º��ʲ���ֵ����Ϊ��"+sumValue);
		return sumValue;
	}

}
