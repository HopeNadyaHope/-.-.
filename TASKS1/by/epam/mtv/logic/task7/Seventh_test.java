package by.epam.mtv.logic.task7;

public class Seventh_test {

	public static double change(double number) {
		if (number<0) {
			number=Math.abs(number);
			return -change(number);
		}
		double integer_part;
		double fractional_part;
		
		
		integer_part=Math.floor(number);
		fractional_part= number*1000-integer_part*1000;
		return fractional_part+integer_part*Math.pow(10,-3);
	}

/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		double number1=123.987;
		double number2=-123.987;
		System.out.println("Number 1 = "+ number1+"; newNumber1 = "+change(number1));
		System.out.println("Number 2 = "+ number2+"; newNumber2 = "+change(number2));

	}

}