package sixth;

import java.math.BigInteger;

public class Sixth_test {

	static double sum(double a1,double d,long n) {
		if(n==1)
			return a1;
		return n/2*(2*a1+(n-1)*d);
	}
			
/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		double a1=1000000, d=-1000;
		long n=1;
		double sum=sum(a1,d,n);
		while((sum<=Integer.MAX_VALUE) && (sum>=Integer.MIN_VALUE)) {
			n++;
			sum=sum(a1,d,n);
		}
		System.out.println("Limit for INT: "+n);

		long k=n;
		while((sum<=Long.MAX_VALUE) && (sum>=Long.MIN_VALUE)) {
			k++;
			sum=sum(a1,d,k);
		}
		System.out.println("Limit for LONG: "+k);
	}
}
