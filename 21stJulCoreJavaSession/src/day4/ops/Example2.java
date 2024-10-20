package day4.ops;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2=20;
		boolean cond1=(num1==num2);
		boolean cond2=(num1>num2);
		boolean finalResult1=(cond1 && cond2);
		boolean finalResult2=(cond1 || cond2);
		System.out.println("Condition1: "+cond1);
		System.out.println("Condition2: "+cond2);
		System.out.println("finalResult1 with &&: "+finalResult1);
		System.out.println("finalResult2 with ||: "+finalResult2);
		
		System.out.println("finalResult1 with &&: "+((num1!=num2) && (num1>num2)));
		System.out.println("finalResult2 with ||: "+((num1!=num2) || (num1<num2)));
		
		System.out.println("finalResult1 with &&: "+((num1!=num2) && (num1>num2)));
		System.out.println("finalResult2 with ||: "+((num1==num2) || (num1<num2)));
		System.out.println("Program Ends");
	}

}
/*
cond1 && cond2
		true: when all condition gives you true value
		false: if any one condition gives you false

cond1 || cond2
		true: if any one condition is also true
		false: if all gives you false
*/