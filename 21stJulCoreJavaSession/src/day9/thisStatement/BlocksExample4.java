package day9.thisStatement;

public class BlocksExample4 {
	static int num1;
	int num2;
	static {
		System.out.println("*************SIB-1****************");
		num1=25;
	}
	BlocksExample4(){
		System.out.println("BlocksExample1 class zero param cons");
	}
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SVG num1: "+num1);
		BlocksExample4 b1=new BlocksExample4();
		System.out.println("NSVG num2: "+b1.num2);
		System.out.println("Program ends");
	}
	
	{
		System.out.println("*************NSIB-1****************");
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