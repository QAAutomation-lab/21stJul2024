package day2.localvariables;

public class LocalVariableExample8 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int b=20;
		int h=10;
		double area;
		//area=1/2*b*h;//area=0.0
			
		//area=(1.0/2)*b*h;//area=100.0
		
		//area=(1/2.0)*b*h;//area=100.0
		
		area=0.5*b*h;//area=100.0
		
		System.out.println("b= "+b);
		System.out.println("h= "+h);
		System.out.println("area= "+area);
		System.out.println("Program ends");
	}
}
/*
	area=1/2*b*h;
	
	area=1/2*20*10;//0*20*10=0
	
	area=b*h;
	
	area=area/2;
*/