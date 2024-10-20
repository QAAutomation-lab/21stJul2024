package day13.abstractionExamples;
abstract class Sample{
	void testing() {
		System.out.println("I am manual Tester");
	}
	abstract void automationTester();	
}
public class Example2 extends Sample{
	void automationTester() {
		System.out.println("I am automation tester");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		//Sample s1=new Sample(); we can't create instance of Abstract class
		Example2 e1=new Example2();//object and reference both are from same class
		e1.testing();
		e1.automationTester();
		
		Sample s1=new Example2();//here object is created from subclass and reference is from parent class
		s1.testing();
		s1.automationTester();
		System.out.println("Program ends");
	}
}
/*
abstract:
	* its a keyword which can be used with class and method, also known as incomplete
	* once its used with class, that class will be known as abstract class or imcomplete class
	* being an incomplete class we are not allowed to create its instance
	* it can have 
		* 	variables,method,constructor like normal class along with abstract method
		* a method declared with abstract keyword without body known as abstract method
	* abstract can be 0-100% abstract means it can have-
		* only abstract method(100%)
		* only non-abstract method(0%)
		* both
	* if any normal class has at least one abstract method dn that class should be declared as abstract class
	* when a subclass inherits the abstract class dn there will be a contract between both the class
	  that is subclass has to provide/override the abstract methods of abstract class else subclass
	  become abstract class
*/