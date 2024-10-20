package day14.accessmodifiers2;

import day14.accessmodifiers1.Demo1;

public class Example1 extends Demo1{

	public static void main(String[] args) {
		// we can access all type of access modifiers from out side the class
		Example1 ref = new Example1();
//		System.out.println("access private num1 from Example1 class: " + ref.num1);//not accessible as its declared as private
//		System.out.println("access default num2 from Example1 class: " + ref.num2);//not accessible from outside the package
		System.out.println("access protected num3 from Example1 class: " + ref.num3);
		System.out.println("access public num4 from Example1 class: " + ref.num4);
	}

}
