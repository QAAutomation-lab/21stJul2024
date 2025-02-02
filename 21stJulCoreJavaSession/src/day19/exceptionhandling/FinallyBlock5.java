package day19.exceptionhandling;

public class FinallyBlock5 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int res;
		try {
			res = 10 / 2;// normal statement
			System.out.println("Result is: " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception msg ------"+e.getMessage()+"--------");
		}finally {
			System.out.println("I am a finally block started");
			res=28/0;
			System.out.println("I am a finally block ended");
		}
		System.out.println("Program ends");
	}
}
