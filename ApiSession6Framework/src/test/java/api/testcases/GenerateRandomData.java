package api.testcases;

import java.util.Random;

import org.testng.annotations.Test;

public class GenerateRandomData {

	@Test
	public void generateRandomNumbers() {
		Random ran=new Random();
		System.out.println("Random number: "+ran.nextInt(1000));//between 0-1000
		int min=10;
		int max=100;
		int number=ran.nextInt(min,max);
		System.out.println("Number: "+number);
	}
	
	@Test
	public void generateRondomString() {
		int length=10;
		String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		StringBuilder ran=new StringBuilder("Pune_");
		Random rand=new Random();
		
		for(int i=0;i<length;i++) {
			int index=rand.nextInt(chars.length());
			ran.append(chars.charAt(index));
		}
		System.out.println("Random String: "+ran);
		
		System.out.println("New Random String: "+getRandomString(25));
	}
	
	public int getRandomNumber(int start, int end) {
		Random ran=new Random();
		int number=ran.nextInt(start,end);
		return number;
	}
	
	public StringBuilder getRandomString(int size) {
		String chars="abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		StringBuilder ran=new StringBuilder();
		Random rand=new Random();
		
		for(int i=0;i<size;i++) {
			int index=rand.nextInt(chars.length());
			ran.append(chars.charAt(index));
		}
		return ran;
	}
}
