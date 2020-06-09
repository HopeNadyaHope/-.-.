package by.epam.mtv.logic.task10;

import java.util.Scanner;

public class Tenth_test {

	public static void printAnswer(boolean ans) {
		if(ans==false)
			System.out.println("no");
		else
			System.out.println("yes");
		return;
	}
		
	
////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		boolean checkMore;
		boolean checkSign;
		boolean checkCouple;
		checkMore=true;		
		checkSign=true;		
		checkCouple=false;
				
		int a;
		a=0;
		int b;
		b=0;
		
		System.out.println("Input sequense: ");
		Scanner in= new Scanner(System.in);
		
		//////////////////////////////////////
		a =in.nextInt();
		if(a==0)
			System.err.println("No numbers");
		else {
			b=in.nextInt();
			
			while(b!=0) {
				if((checkMore) && (a>=b))
					checkMore=false;
					
				if((checkSign) && (a*b>=0))
					checkSign=false;
					
				if(!(checkCouple) && (a==b))
					checkCouple=true;
					
				a=b;
				b=in.nextInt();
			}
		
			//////////////////////////////////////
			System.out.print("Increasing sequence: ");
			printAnswer(checkMore);	
		
			System.out.print("There are a couple of identical neighbors: ");
			printAnswer(checkCouple);
		
			System.out.print("Alternating sequence: ");
			printAnswer(checkSign);
		}
	}
}
