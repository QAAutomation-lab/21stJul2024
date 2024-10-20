package day2.localvariables;

public class LocalVariableExample9 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//declaration & initialization both at same time
//		int num1=10;
//		int num2=5;
//		int result=num1+num2;
				//or
		//if you have multiple variable of same type dn we can declare them at the same line, later we can initialize them based on the need
//		int num1,num2,result;
//		num1=10;
//		num2=5;
//		result=num1+num2;	
				//or
		//if you want to declare & initialize same type of multiple variable at the same time
		int num1=10,num2=5,result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+result);
		System.out.println("Program ends");
	}
}