package by.epam.mtv.logic.task6;


public class Sixth_test {
	
	static double sum(double a1,double d,long n) {
		if(n==1)
			return a1;
		return n/2*(2*a1+(n-1)*d);
	}
	
	
	public static int sumINT(int a1,int d,long n) {
		return (int) (n/2*(2*a1+(n-1)*d));
	}
	
	
	public static long sumLONG(int a1,int d,long n) {
		return n/2*(2*a1+(n-1)*d);
	}
	
	
	//////////////WHEN SIGN a1 =SIGN d/////////////////////////
	public static long FindForINT(int a1,int d) {
		if(Math.signum(a1)==Math.signum(d) && Math.signum(a1)==-1)
			return FindForINT(-a1,-d);
			
		long n;
		n=2;
	
		int Sn;
		int SnNext;
		Sn=a1;
		SnNext=sumINT(a1,d,n);
			
		while(SnNext > Sn) {
			n++;
			Sn=SnNext;
			SnNext=sumINT(a1,d,n);
		}
		return n;
	}
	
	public static long FindForLONG(int a1,int d) {
		if(Math.signum(a1)==Math.signum(d) && Math.signum(a1)==-1)
			return FindForLONG(-a1,-d);
		
		long n;
		n=2;
		
		long Sn;
		long SnNext;
		Sn=a1;
		SnNext=sumLONG(a1,d,n);
		
		while(SnNext > Sn) {
			n++;
			Sn=SnNext;
			SnNext=sumLONG(a1,d,n);
		}	
		return n;
	}

	////////////////////////////////////////////////////////////
	/////////////////MAIN FUNCTION//////////////////////////////
	
	public static void main(String[] args) {
		int a1;
		int d;
		a1=10000;
		d=500;
		
		System.out.println("Limit for INT: "+FindForINT(a1,d));
		System.out.println("Limit for LONG: "+FindForLONG(a1,d));
		
		
		///////////USING DOUBLE//////////////////////
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
