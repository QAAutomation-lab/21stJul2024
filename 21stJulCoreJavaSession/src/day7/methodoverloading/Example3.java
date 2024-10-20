package day7.methodoverloading;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		main();
		System.out.println("Program ends");
	}
	
	public static void main() {
		System.out.println("I am overloaded main()");
	}
}
