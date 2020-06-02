package third;

import java.util.Random;

public class Third_test {
	static double creating() {
		Random random = new Random();
		double x = random.nextDouble()*10-5;
		return x;
	}
	
	static boolean check(double a, double b, double c) {
		if(a>b && b>c)
			return true;
		return false;
	}
	
/////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		double a=creating();
		double b=creating();
		double c=creating();
		System.out.println("a= "+a+", b="+b+", c="+c);
		if(check(a,b,c)) {
			a*=2;
			b*=2;
			c*=2;
		}
		else {
			a=Math.abs(a);
			b=Math.abs(b);
			c=Math.abs(c);
		}	
		System.out.println("a= "+a+", b="+b+", c="+c);
	}

}
