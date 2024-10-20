package day2.localvariables;

public class LocalVariableExample5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		// + | - | * | / | %
		int num1=10;
		int num2=5;
		int result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+result);
		System.out.println("*****************Sub*********************");
		//re-initializing num1 & result
		num1=25;
		result=num1-num2;
		System.out.println("Number1: "+num1+"\nNumber2: "+num2+"\nResult: "+result);
		System.out.println("******************Multi*******************");
		//re-initializing result
		result=num1*num2;
		System.out.println("Number1: "+num1+"\nNumber2: "+num2+"\nResult: "+result);
		System.out.println("******************div*******************");
		//re-initializing result & num2
		num2=25;
		result=num1/num2;
		System.out.println("Number1: "+num1+"\nNumber2: "+num2+"\nResult: "+result);
		System.out.println("******************Mod*******************");
		//re-initializing result, num1 & num2
		num1=36;
		num2=6;
		result=num1%num2;
		System.out.println("Number1: "+num1+"\nNumber2: "+num2+"\nResult: "+result);
		System.out.println("Program ends");
	}
}
/*
\n: new line, when you want a new line in middle of statement we use this
\t: tab, when you want horizontal space between two words we use this
*/