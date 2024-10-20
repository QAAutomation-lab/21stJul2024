package day7.methodoverloading;

public class Example1 {

	public static void main(String[] args) {
		addition(15.36, 10);
		addition();
		addition(10,25.36);
	}
	
	static void addition() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("int Result: "+res);
	}
	static void addition(int num1,int num2) {//number of parameter diff.
		int res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("int Result: "+res);
	}
	static void addition(double num1,int num2) {//type of parameter diff.
		double res=num1+num2;
		System.out.println("double Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("double Result: "+res);
	}
	static void addition(int num1,double num2) {//position of parameter diff.
		double res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("double Number2: "+num2);
		System.out.println("double Result: "+res);
	}
}
