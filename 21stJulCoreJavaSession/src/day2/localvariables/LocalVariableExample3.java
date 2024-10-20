package day2.localvariables;

public class LocalVariableExample3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//declaration & initialization of variable-> datatype variablename =value;
		byte byteVariable=20;//-10 | 25 | 60 | -90
		short shortVariable=30;//-50 | 80 | -10 | 70
		int intVariable=40;//-50 | 80 | -10 | 70
		long longVariable=50l;//-50 | 80 | -10 | 70
		float floatVariable=50.36f;//-50 | 80 | -10 | 70 | 10.25f | -25.96f;
		double doubleVariable=25.36d;//-50 | 80 | -10 | 70 | 25.36 | -10.54f;
		char charVariable='A';//'a' | 'Z' | '+' | '/'
		boolean booleanVariable=true;//false			
		System.out.println("byteVariable="+byteVariable);//byteVariable
		System.out.println("shortVariable="+shortVariable);
		System.out.println("intVariable="+intVariable);
		System.out.println("longVariable="+longVariable);
		System.out.println("floatVariable="+floatVariable);
		System.out.println("doubleVariable="+doubleVariable);
		System.out.println("charVariable="+charVariable);
		System.out.println("booleanVariable="+booleanVariable);
		System.out.println("Program ends");
	}
}
/*
+ : addition- add two number and give new number
	10+20=30
	
+ : Concatenation- if number getting added in string dn it will give you result as String with combination of StringNumber
	"Hello"+10=Hello10
	"Hello"+10+20+30=Hello102030
	"Hello"+(10+20+30)=Hello60
	10+20+30+"Hello"=60Hello
	10+20+"Hi"+50+(60+70)=30Hi50130

Program starts
byteVariable=20
Program ends
*/