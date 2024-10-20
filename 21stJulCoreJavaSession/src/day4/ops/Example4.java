package day4.ops;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2;
		num2=num1++;//increment-post -->num1=num1+1;  but once value is given to num2
		System.out.println("Number1: "+num1);//26
		System.out.println("Number2: "+num2);//25
		System.out.println("***********************************");
		num1=0;
		num2=++num1;//increment-pre -->num1=num1+1; update num1 value before giving to num2
		System.out.println("Number1: "+num1);//1
		System.out.println("Number2: "+num2);//1
		System.out.println("***********************************");
		num1=10;
		num2=num1--;//decrement-post -->num1=num1-1;  but once value is given to num2
		System.out.println("Number1: "+num1);//9
		System.out.println("Number2: "+num2);//10
		System.out.println("***********************************");
		num1=20;
		num2=--num1;//decrement-pre -->num1=num1-1; update num1 value before giving to num2
		System.out.println("Number1: "+num1);//19
		System.out.println("Number2: "+num2);//19
		System.out.println("***********************************");
		System.out.println("Program Ends");
	}
}
/*
pre: 1st operation dn use the updated value
post: 1st use the value fn perform operation
*/