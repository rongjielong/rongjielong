package test;


public class A {
	boolean test1(int select){

			System.out.println("请问您想要进行单利计算还是复利计算：1.单利 2.复利");
			if(select != 1 && select != 2)
				return false;
			else
				return true;
	
	}
}
