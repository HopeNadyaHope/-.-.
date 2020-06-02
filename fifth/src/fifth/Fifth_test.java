package fifth;

public class Fifth_test {

	static int[] createDigits(int number) {
		int n=number;
		int[] mas=new int[3];
		for(int i=2;i>=0;i--) {
			mas[i]=n%10;
			n/=10;			
		}		
		return mas;
	}
	
	static void sumOfDigits(int[]digits) {
		int sum=0;
		for(int i=2;i>=0;i--) {
			sum+=digits[i];			
		}
		System.out.println("SumOfDigits: "+sum);
		return;
	}
	
	static void multOfDigits(int[]digits) {
		int mult=1;
		for(int i=2;i>=0;i--) {
			mult*=digits[i];			
		}
		System.out.println("MultOfDigits: "+mult);
		return;
	}
	
	static void newThreeDigitsNumber(int[]digits) {		
		System.out.println("newThreeDigitsNumber: "+(100*digits[1]+10*digits[0]+digits[2]));
		return ;
	}
	
	static void newFourDigitsNumber(int[]digits) {
		System.out.println("newFourDigitsNumber: "+(1000*digits[2]+100*digits[0]+10*digits[1]+digits[2]));
		return;
	}
	
/////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		int number=276;
		System.out.println("Number: "+number);
		int[] digits=createDigits(number);
		sumOfDigits(digits);
		multOfDigits(digits);
		newThreeDigitsNumber(digits);
		newFourDigitsNumber(digits);
	}
}
