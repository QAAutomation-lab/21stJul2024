package day11.inheritanceExamples;
class Demo1{
	int num1=25;
	static double num2=25000;
}
class Demo2{
	int num3=43;
	static double num4=35000;
}
class Demo3{
	int num5=12;
	static double num6=45000;
}
public class Example1 {
	int num7=76;
	static double num8=15000;
	public static void main(String[] args) {
		System.out.println("Programs Starts");
		System.out.println("*************Accessing static member of required classes****************");
		System.out.println("num2 from Demo1 class: "+Demo1.num2);
		System.out.println("num4 from Demo2 class: "+Demo2.num4);
		System.out.println("num6 from Demo3 class: "+Demo3.num6);
		System.out.println("num8 from Example1 class: "+Example1.num8);
		System.out.println("*************Accessing non-static member of required classes****************");
		Demo1 d1=new Demo1();
		System.out.println("num1 from Demo1 class: "+d1.num1);
		Demo2 d2=new Demo2();
		System.out.println("num3 from Demo2 class: "+d2.num3);
		Demo3 d3=new Demo3();
		System.out.println("num5 from Demo3 class: "+d3.num5);
		Example1 e1=new Example1();
		System.out.println("num7 from Example1 class: "+e1.num7);
		System.out.println("Programs ends");
	}

}
