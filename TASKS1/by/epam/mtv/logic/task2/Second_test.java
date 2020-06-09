package by.epam.mtv.logic.task2;

public class Second_test {
	
	public static int DayInMonth(int month) {
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: return 31;
			
			case 4:
			case 6:
			case 9:
			case 11: return 30;
			
			case 2: return 28;
		}
		return 0;
	}
	
	/////////////////////
	
	public static Date FindDate(int n) {
		int month;
		month=1;
		
		int day_in_month;
		day_in_month=DayInMonth(month);
			
		while(n>day_in_month) {
			n-=day_in_month;
			month++;
			day_in_month=DayInMonth(month);
		}
		
		Date date;
		date = new Date(month,n);
		return date;		
	}
	
/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int n;
		n=178;
		
		System.out.println("Nomber: " +n);
		System.out.println(FindDate(n));
	}
}

