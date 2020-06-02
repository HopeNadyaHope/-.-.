package eighth;

public class Eighth_test {

	static double function(double x,double c) {
		if(x==15)
			return (x-c)+6;
		return (x+c)*2;
	}
	
	static void counting(double a, double b, double  c, double h) {
		for(double x=a;x<=b;x+=h) {
			System.out.println("x= "+x+"    y= "+function(x,c));
		}
		return;
	}

/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		double a=10.5, b=25.5, c= 2.7, h= 0.5;
		counting(a,b,c,h);
	}
}
