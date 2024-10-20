package day19.exceptionhandling;

public class ThrowKeyword1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		//validateAge(19);
		validateAge(15);
		System.out.println("Program ends");
	}
	
	static void validateAge(int age) {
		if(age>18) {
			System.out.println("Welcome to FB, you can create an account");
		}else {
			throw new ArithmeticException("Sorry, you are belwo 18, not allowed to create account");
		}
	}

}
