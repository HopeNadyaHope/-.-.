package by.epam.mtv.logic.task5;

public class Number {
	int unit;
	int dozen;
	int hundred;
	
	public Number(int n) {
		this.unit=n%10;
		n/=10;
		
		this.dozen=n%10;
		n/=10;
		
		this.hundred=n;
		
	}
		
	///////////////////////////////////////////////
	public int SumOfDigits() {		
		return this.hundred + this.dozen + this.unit;
	}	
	
	public int MultOfDigits() {
		return this.hundred * this.dozen * this.unit;
	}

	
	public int NewThreeDigitsNumber() {
		return 	100*this.dozen + 10*this.hundred + this.unit;
	}

	
	public int NewFourDigitsNumber() {
		return 1000*this.unit + 100*this.hundred + 10*this.dozen  + this.unit;
	}
	
}
