package day7.methodoverloading;

public class Example4 {

	public static void main(String[] args) {
		Example4 ref=new Example4();
		ref.addition(36, 10);
		ref.addition();
	}
	
	void addition() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("int Result: "+res);
	}
	int addition() {//number of parameter diff.
		int res=num1+num2;
		System.out.println("int Number1: "+num1);
		System.out.println("int Number2: "+num2);
		System.out.println("int Result: "+res);
		return res;
	}
}
/*
overloading can be done by changing parameters only not with return type change

*/