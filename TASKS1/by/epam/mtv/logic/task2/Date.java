package by.epam.mtv.logic.task2;

public class Date{
	int month;
	int day;

	public Date(int month, int day) {
		this.month=month;
		this.day=day;
	}
	
	///////////////////////////

	public String toString () {
		return "Month: "+month+"\nDay: "+day;
	}
	
}
	