package first;

import java.util.Random;

public class First_test {
	static double creating() {
		Random random = new Random();
		double x = random.nextDouble()*5;
		return x;
	}
	
	static void expression(double a, double b, double c) {
		double square=Math.pow(b, 2)+4*a*c;
		if (square<0) {
			System.err.println("Complex answer");
			return;		
		}
		double numerator=b+Math.sqrt(square);
		double result=numerator/(2*a);
		result-=Math.pow(a, 3)*c;
		result+=Math.pow(b, -2);	
		System.out.println("Answer = "+result);
		return;
	}
	
/////////////////////////////////////////////////////////////
	public static void main(String[] args){		
		double a=creating();
		double b=creating();
		double c=creating();
		System.out.println("a = "+a+", b = "+b+", c = "+c);
		expression(a,b,c);			
	}
}
