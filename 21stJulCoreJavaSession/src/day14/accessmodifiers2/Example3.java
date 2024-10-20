package day14.accessmodifiers2;
public class Example3 {

	public static void main(String[] args) {
		// we can access all type of access modifiers from out side the class
		day14.accessmodifiers1.Demo1 ref = new day14.accessmodifiers1.Demo1();
//		System.out.println("access private num1 from Example1 class: " + ref.num1);//not accessible as its declared as private
//		System.out.println("access default num2 from Example1 class: " + ref.num2);//not accessible from outside the package
//		System.out.println("access protected num3 from Example1 class: " + ref.num3);//not accessible without inheritance from outside the package
		System.out.println("access public num4 from Example1 class: " + ref.num4);
	}
}
class Sample2 {

	public static void main(String[] args) {
		// we can access all type of access modifiers from out side the class
		day14.accessmodifiers1.Demo1 ref = new day14.accessmodifiers1.Demo1();
//		System.out.println("access private num1 from Sample1 class: " + ref.num1);//not accessible as its declared as private
//		System.out.println("access default num2 from Sample1 class: " + ref.num2);//not accessible from outside the package
//		System.out.println("access protected num3 from Sample1 class: " + ref.num3);//not accessible without inheritance from outside the package
		System.out.println("access public num4 from Sample1 class: " + ref.num4);
	}
}
/*
we can also access public members from outside the class using Fully Qualified class
		package.classname
if you are using fully qualified class name then for each object creation you need to use fully qualified class name
*/