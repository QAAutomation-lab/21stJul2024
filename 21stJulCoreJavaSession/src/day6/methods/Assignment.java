package day6.methods;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("is given number prime? "+checkPrime(23));
	}
	
	static boolean checkPrime(int num) {
		int ct=0;
		boolean res;
		System.out.println("Number is "+num);
		for(int i=1;i<=num;i++) {
			if(num>1) {
				if(num%i==0) {
					ct++;
				}
			}else {
				System.out.println("Either the given numbe is 1 or less then 1.");
			}
		}		
		if(ct==2) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}

}
/*
WAM for
	palindrome
	to check prime number
	to print even number of given range
	factor of +ive number
*/