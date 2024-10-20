package day4.ops;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=-8,num2;
		num2=--num1 + --num1 + ++num1 + num1-- + --num1 + num1--;
//initial   =   -9  +  -10   +   -9   +   -9   +  -11   +   -11
//final		=   -9     -10		 -9	      -10     -11       -12
		System.out.println("Number1: "+num1);//
		System.out.println("Number2: "+num2);//
		System.out.println("Program Ends");
	}
}
/*
-8 + -1=-9
pre: 1st operation dn use the updated value
post: 1st use the value fn perform operation
*/