package day5.conditionstatements;

public class Assignment {

	public static void main(String[] args) {
		int num=121, rem,rev=0,temp=num;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;//123%10=3 | 12%10=2 |1%10=1
			rev=rev*10+rem;//0*10+3=3| 3*10+2=32 | 32*10+1=321
			num=num/10;//123/10=12 | 12/10=1 | 1/10=0
		}
		System.out.println("Reverse number: "+rev);
		
		if(temp==rev) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
	}

}
/*
Find ASCII value of a character
Compute Quotient and Remainder
Swap two numbers using temporary variable

if-else:
Find Largest Among three numbers using if..else statement
Java Program to Check a Leap Year

for-loop:
Display Sum of n Natural Numbers
Display uppercased alphabet using for loop
Count Number of Digits in an Integer using for loop
Reverse a number using a for loop in Java
Java Program to Check Palindrome number
Program to Check Prime Number using a for loop
Factors of a Positive Integer
Factors of Negative Number

while-loop:
Count Number of Digits in an Integer using while loop
Reverse a Number using a while loop in Java
Java Program to Check Palindrome Number
Program to Check Prime Number using a while loop
Check Armstrong Number for 3 digit number

*/