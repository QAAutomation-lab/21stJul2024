package day3.variableTypes;

public class StaticGlobalVariableExample1 {

	static int num1,num2;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("SGV num1: "+num1);//0
		System.out.println("SGV num1: "+num2);//0
		int result;
		num1=25;
		num2=45;
		result=num1+num2;
		System.out.println("After initialization,SGV num1: "+num1);//25
		System.out.println("After initialization,SGV num1: "+num2);//45
		System.out.println("Result: "+result);
		System.out.println("Program Ends");
	}

}
/*
1. static global variable or class variable:
	* a variable declared outside the method/constructor body with static keyword known as static global variable.
	* these variables are also known as class variable because they are loaded into the memory automatically at the time
	  of compilation when .class file is getting generated.
	* visibility/accessibility: can be access from anywhere using following ways-
		a. these variables can be access from another static method directly(recommended within same class)
				System.out.println(age);
				age=25;
		b. standard: always use classname to access these variables
				classname.staticglobalvariable
				System.out.println(VariableTypes.age);
				VariableTypes.age=25;
	* memory: these variable gets a single/one time separate memory
	* default value: there is default value based on datatype is globale variables are declared and used without
					 initialization.
					- byte,short,int,long default value is '0'
					- float, double default value is 0.0
					- char default value is blank space(' ')
					- boolean default value is false
*/