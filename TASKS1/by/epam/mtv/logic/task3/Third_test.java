package by.epam.mtv.logic.task3;


public class Third_test {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		a=5;
		b=3;
		c=1;
		
		System.out.println("a= "+a+", b="+b+", c="+c);
				
		if((a>b) && (b>c)) {
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


