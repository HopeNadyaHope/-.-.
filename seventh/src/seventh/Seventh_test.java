package seventh;

public class Seventh_test {

	static double change(double number) {
		if (number<0) {
			number=Math.abs(number);
			return -change(number);
		}
		double [] parts= new double[2];
		parts[0]=(int) Math.floor(number);
		parts[1]=number*1000-parts[0]*1000;
		return parts[1]+parts[0]*Math.pow(10,-3);
	}

/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		double number1=123.987;
		double number2=-123.987;
		System.out.println("Number 1 = "+ number1+"; newNumber1 = "+change(number1));
		System.out.println("Number 2 = "+ number2+"; newNumber2 = "+change(number2));

	}

}
