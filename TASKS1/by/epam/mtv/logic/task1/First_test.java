package by.epam.mtv.logic.task1;

public class First_test {

	public static void expression(double a, double b, double c) {
		if((a==0) || (b==0)) {
			System.err.println("Division by 0");
			return;
		}
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
		double a;
		double b;
		double c;
		a=5;
		b=1.5;
		c=0.005;
		
		System.out.println("a = "+a+", b = "+b+", c = "+c);
		expression(a,b,c);			
	}
}
