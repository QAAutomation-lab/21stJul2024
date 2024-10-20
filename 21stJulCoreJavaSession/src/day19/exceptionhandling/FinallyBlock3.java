package day19.exceptionhandling;

public class FinallyBlock3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int res;
		try {
			res = 10 / 0;// abnormal statement
			System.out.println("Result is: " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception msg ------"+e.getMessage()+"--------");
		}finally {
			System.out.println("I am a finally block...");
		}
		System.out.println("Program ends");
	}
}
