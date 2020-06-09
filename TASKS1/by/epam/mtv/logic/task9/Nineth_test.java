package by.epam.mtv.logic.task9;

public class Nineth_test {

	public static long multiply() {
		int sum=3;
		long mult=3;
		for(int i=3;i<=10;i++) {
			sum+=i;
			mult*=sum;
		}
		return mult;
	}

/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("(1+2)*...*(1+2+3+...+10) = "+multiply());
	}

}