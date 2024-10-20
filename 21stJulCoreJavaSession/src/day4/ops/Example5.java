package day4.ops;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2;
		num2=num1++ + num1 + ++num1 + num1-- + --num1;
//initial   =  25   + 26   +   27   +  27    +   25
//final		=  26     26       27      26        25
		System.out.println("Number1: "+num1);//25
		System.out.println("Number2: "+num2);//130
		System.out.println("Program Ends");
	}
}
/*
pre: 1st operation dn use the updated value
post: 1st use the value fn perform operation
*/