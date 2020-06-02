package tenth;

import java.util.Scanner;

public class Tenth_test {

	static void printAnswer(boolean ans) {
		if(ans==false)
			System.out.println("no");
		else
			System.out.println("yes");
		return;
	}
	
	public static void main(String[] args) {
		boolean checkMore=true, checkSign=true, checkCouple=false;
		int a=0,b=0;
		System.out.println("Input sequense: ");
		Scanner in= new Scanner(System.in);
		a =in.nextInt();
		if(a==0)
			System.err.println("No numbers");
		else {
			b=in.nextInt();
			if(b==0)
				System.err.println("Only one number");
			else {
				while(b!=0) {
					if(!(checkMore) || (a>=b))
						checkMore=false;
					if(!(checkSign) || (a*b>0))
						checkSign=false;
					if(!(checkCouple)&&(a==b))
						checkCouple=true;
					a=b;
					b=in.nextInt();
				}
		
				System.out.print("Increasing sequence: ");
				printAnswer(checkMore);	
		
				System.out.print("There are a couple of identical neighbors: ");
				printAnswer(checkCouple);
		
				System.out.print("Alternating sequence: ");
				printAnswer(checkSign);
			}
		}
	}
}
