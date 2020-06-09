package by.epam.mtv.logic.task4;

public class Fourth_test {

	public static double functionF(double x) {
		if(x>13)
			return -3/(x+1);
		else
			return -Math.pow(x, 3)+9;
	}

/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		double x;		
		double y;
		x=3.5;
		y=59;
		
		System.out.println("x= "+x +", F(x)= "+functionF(x));
		System.out.println("y= "+y +", F(y)= "+functionF(y));
	}

}