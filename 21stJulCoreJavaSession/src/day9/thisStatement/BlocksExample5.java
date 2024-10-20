package day9.thisStatement;

public class BlocksExample5 {
	static int num1;
	int num2;
	static {
		System.out.println("*************SIB-1****************");
		callingSVG();
		num1=25;
	}
	BlocksExample5(){
		System.out.println("BlocksExample1 class zero param cons");
	}
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		callingSVG();
		BlocksExample5 b1=new BlocksExample5();
		b1.callingNSVG();
		System.out.println("Program ends");
	}
	
	static void callingSVG(){
		System.out.println("num1 from callingSGV method: "+num1);
	}
	void callingNSVG(){
		System.out.println("num2 from callingNSGV method: "+num2);
	}
	
	{
		System.out.println("*************NSIB-1****************");
		callingNSVG();
		num2=45;
	}
}
/*
blocks:
	
	static{
		//static block | SIB 
	}
	
	{
		//non-static block | NSIB
	}

SIB:
	these block will be executed before main method
	we can have multiple SIB in a class, in this case all SIB will be executed in sequential order before main()
	basically used to provide important information before entering into actual logic
NSIB:
	these block will be executed when any instance of a class is created but before constructor
	we can have multiple NSIB in a class, in this case all NSIB will be executed in sequential order before constructor
	basically used to provide information before you start using the created object
*/