package day3.variableTypes;

public class Example1 {

	static int num1=15,num2=25;
	double num3,num4=55;
	public static void main(String[] args) {
		System.out.println("Program starts");
		int result;
		//using SGV perform addition and store the final value in result variable
		result=num1+num2;
		System.out.println("SGV num1: "+num1);
		System.out.println("SGV num2: "+num2);
		System.out.println("Result: "+result);
		
		//using NSGV perform subtraction and store final value in result variable(if required re-initialize variables)
		Example1 ref=new Example1();
		ref.num3=65;
		double result1=ref.num3-ref.num4;
		System.out.println("NSGV num3: "+ref.num3);
		System.out.println("NSGV num4: "+ref.num4);
		System.out.println("Result1: "+result1);
		System.out.println("Program ends");
	}

}
/*

*/