package day19.exceptionhandling;

public class Example8 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int[] res=new int[3];
		try {
			res[3] = 10 / 0;// abnormal statement
			System.out.println("Result is: " + res[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//complete exception as it is
		}catch (ArithmeticException e) {
			e.printStackTrace();//complete exception as it is
		}catch (Exception e) {
			e.printStackTrace();//complete exception as it is
		}
		
		try {
			res[3] = 10 / 5;// abnormal statement
			System.out.println("Result is: " + res[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//complete exception as it is
		}catch (ArithmeticException e) {
			e.printStackTrace();//complete exception as it is
		}catch (Exception e) {
			e.printStackTrace();//complete exception as it is
		}
		
		
		System.out.println("Program ends");
	}
}
/*
Unreachable code/block


*/