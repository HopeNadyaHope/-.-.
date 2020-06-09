package by.epam.mtv.logic.task8;

public class Eighth_test {

	static double function(double x,double c) {
		if(x==15)
			return (x-c)+6;
		return (x+c)*2;
	}
/////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double h;
		
		a=10.5;
		b=25.5;
		c= 2.7;
		h= 0.5;
		
		for(double x=a;x<=b;x+=h) {
			System.out.println("x= "+x+"    y= "+function(x,c));
		}
	}
}
