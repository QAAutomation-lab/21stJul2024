package day11.inheritanceExamples;
class GrandFather1{
	GrandFather1(){
		System.out.println("I am GrandFather1 class constructor");
	}
	void myHome() {
		System.out.println("Welcome to GrandFather's home");
	}
}
class Father1 extends GrandFather1{
	Father1(int n){
		//super();//written by java compiler
		System.out.println("I am father class constructor");
	}
	void myCar() {
		System.out.println("Enjoying Father's Car ride");
	}
}
class Child1 extends Father1{
	Child1(){
		super(25); //explicit super() when parent class doesn;t have default or zero parameterized constructor
		System.out.println("I am child class constructor");
	}
	void myBike() {
		System.out.println("Lets go on a ride on bike");
	}
	/**
	 * virtual/inherited method
	 *		1. myHome()
	 *		2. myCar()
	 */
}
public class Example3 {
	//default constructor
	public static void main(String[] args) {
		Child1 cRef=new Child1();
		cRef.myHome();
		cRef.myCar();
		cRef.myBike();
	}
}
/**
using inheritance we can inherit non-static member parent class to child

to represent inheritance we need to use "extends" keyword between child and parent

		parent class---> super class | base class
		child class ---> sub class   | derived class

in order to achieve inheritance we need constructor chaining-

constructor chaining- when subclass constructor calls super class constructor and 
						super class constructor calls its super class constructor dn its 
						known as constructor chaining
						
to achieve constructor chaining we need to user super().

super() is used to call parent class constructor based on parameter
super() should be the first statement inside the constructor body
*/