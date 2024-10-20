package day8.constructors;

public class Example2 {
	int age;
	double salary;
	Example2(int a){
		System.out.println("I am int-param cons of Example1 class");
		age=a;
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 ref=new Example2(10);
		System.out.println("age value with ref : "+ref.age);
		System.out.println("salary value with ref: "+ref.salary);
		
		Example2 ref1=new Example2(30);
		System.out.println("age value with ref1 : "+ref1.age);
		System.out.println("salary value with ref1: "+ref1.salary);
		System.out.println("Program ends");
	}

}
