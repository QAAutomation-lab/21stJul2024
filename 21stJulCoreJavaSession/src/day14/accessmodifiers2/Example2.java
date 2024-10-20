package day14.accessmodifiers2;

import day14.accessmodifiers1.Demo1;

public class Example2 {

	public static void main(String[] args) {
		// we can access all type of access modifiers from out side the class
		Demo1 ref = new Demo1();
//		System.out.println("access private num1 from Example1 class: " + ref.num1);//not accessible as its declared as private
//		System.out.println("access default num2 from Example1 class: " + ref.num2);//not accessible from outside the package
//		System.out.println("access protected num3 from Example1 class: " + ref.num3);//not accessible without inheritance from outside the package
		System.out.println("access public num4 from Example1 class: " + ref.num4);
	}
}

class Sample1 {

	public static void main(String[] args) {
		// we can access all type of access modifiers from out side the class
		Demo1 ref = new Demo1();
//		System.out.println("access private num1 from Sample1 class: " + ref.num1);//not accessible as its declared as private
//		System.out.println("access default num2 from Sample1 class: " + ref.num2);//not accessible from outside the package
//		System.out.println("access protected num3 from Sample1 class: " + ref.num3);//not accessible without inheritance from outside the package
		System.out.println("access public num4 from Sample1 class: " + ref.num4);
	}
}
/*
private members: are accessible with the class only
Default member: are accessible within the package only
protected member: are accessible from anywhere using inheritance but its class should be declare as public
public member: are accessible from anywhere but its class should be declared as public
*/