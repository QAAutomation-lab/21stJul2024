package day19.exceptionhandling;
class ShaileshException extends Exception{
	ShaileshException(String exp){
		super(exp);
	}
}
public class ThrowKeyword2 {

	public static void main(String[] args) throws ShaileshException {
		System.out.println("Program starts");
		printing();
		//validateAge(19);
		validateAge(15);
		System.out.println("Program ends");
	}
	
	static void printing() {
		System.out.println("I am printing method");
		try {
			validateAge(17);
		} catch (ShaileshException e) {
			e.printStackTrace();
		}
		System.out.println("I am printing method ends");
	}
	
	static void validateAge(int age) throws ShaileshException {
		if(age>18) {
			System.out.println("Welcome to FB, you can create an account");
		}else {
			throw new ShaileshException("Sorry, you are belwo 18, not allowed to create account");
		}
	}

}
/*
you can create exception of your name that will be known as custom exception, which is also known as checked exception

*/