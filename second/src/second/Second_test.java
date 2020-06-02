package second;

import java.util.Random;

public class Second_test {

	static int creating() {
		Random random = new Random();
		int x = random.nextInt(365)+1;
		return x;
	}
	
	static void monthAndDay(int n) {
		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] nameOfMonth= {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		int month=0;
		while(n>daysInMonth[month]) {
			n-=daysInMonth[month];
			month++;
		}
		System.out.println("Day: "+n);
		System.out.println("Month: "+nameOfMonth[month]);
	}

/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int n=creating();
		System.out.println("Nomber: " +n);
		monthAndDay(n);
	}

}
