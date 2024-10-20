package day7.methodoverloading;

public class Example2 {

	public static void main(String[] args) {
		Example2 ref=new Example2();
		ref.addition(15.36, 10);
		ref.addition();
		ref.addition(10,25.36);
	}
	
	void addition() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("int Result: "+res);
	}
	void addition(int num1,int num2) {//number of parameter diff.
		int res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("int Result: "+res);
	}
	void addition(double num1,int num2) {//type of parameter diff.
		double res=num1+num2;
		System.out.println("double Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("double Result: "+res);
	}
	void addition(int num1,double num2) {//position of parameter diff.
		double res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("double Number2: "+num2);
		System.out.println("double Result: "+res);
	}
}
