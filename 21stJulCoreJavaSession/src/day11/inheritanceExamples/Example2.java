package day11.inheritanceExamples;
class GrandFather{
	//default constructor
	void myHome() {
		System.out.println("Welcome to GrandFather's home");
	}
}
class Father extends GrandFather{
	//default constructor with default super()
	void myCar() {
		System.out.println("Enjoying Father's Car ride");
	}
}
class Child extends Father{
	//default constructor with default super()
	void myBike() {
		System.out.println("Lets go on a ride on bike");
	}
	/**
	 * virtual/inherited method
	 *		1. myHome()
	 *		2. myCar()
	 */
}
public class Example2 {
	//default constructor
	public static void main(String[] args) {
		Child cRef=new Child();
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