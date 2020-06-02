package fourth;

public class Fourth_test {

	static double theFirstPart(double x) {
		return -Math.pow(x, 3)+9;
	}
	
	static double theSecondPart(double x) {
		return -3/(x+1);
	}
	
	static double functionF(double x) {
		if(x>13)
			return theSecondPart(x);
		else
			return theFirstPart(x);
	}

/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("x=13: "+functionF(13));
		System.out.println("x=-2: "+functionF(-2));
		System.out.println("x=14: "+functionF(14));
		System.out.println("x=0.276: "+functionF(0.276));
	}

}
