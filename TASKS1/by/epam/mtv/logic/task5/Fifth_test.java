package by.epam.mtv.logic.task5;

public class Fifth_test {

	public static void main(String[] args) {
		int n=276;
		System.out.println("Number: "+n);
		
		Number num=new Number(n);
		
		System.out.println("SumOfDigits: "+num.SumOfDigits());
		System.out.println("MultOfDigits: "+num.MultOfDigits());
		System.out.println("newThreeDigitsNumber: "+num.NewThreeDigitsNumber());
		System.out.println("newFourDigitsNumber: "+ num.NewFourDigitsNumber());
	}
}
