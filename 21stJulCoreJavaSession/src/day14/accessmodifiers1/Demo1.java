package day14.accessmodifiers1;

public class Demo1 {
	private int num1 = 25;
	int num2 = 30;
	protected int num3 = 40;
	public int num4 = 50;

	public static void main(String[] args) {
		// we can access all type of access modifiers with in the class
		Demo1 ref = new Demo1();
		System.out.println("access private num1 from Demo1 class: " + ref.num1);
		System.out.println("access default num2 from Demo1 class: " + ref.num2);
		System.out.println("access protected num3 from Demo1 class: " + ref.num3);
		System.out.println("access public num4 from Demo1 class: " + ref.num4);
	}
}
class Example1 {

	public static void main(String[] args) {
		// we can access all type of access modifiers from out side the class
		Demo1 ref = new Demo1();
		//System.out.println("access private num1 from Example1 class: " + ref.num1);//not accessible as its declared as private
		System.out.println("access default num2 from Example1 class: " + ref.num2);
		System.out.println("access protected num3 from Example1 class: " + ref.num3);
		System.out.println("access public num4 from Example1 class: " + ref.num4);
	}

}
