package day2.localvariables;

public class LocalVariableExample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//declaration of variable-> datatype variablename;
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;
		//initialization of variable-> variablename=value;
		byteVariable=20;//-10 | 25 | 60 | -90
		shortVariable=30;//-50 | 80 | -10 | 70
		intVariable=40;//-50 | 80 | -10 | 70
		longVariable=50l;//-50 | 80 | -10 | 70
		floatVariable=50.36f;//-50 | 80 | -10 | 70 | 10.25f | -25.96f;
		doubleVariable=25.36d;//-50 | 80 | -10 | 70 | 25.36 | -10.54f;
		charVariable='A';//'a' | 'Z' | '+' | '/'
		booleanVariable=true;//false		
		System.out.println("byteVariable="+byteVariable);//byteVariable
		//TODO: print remaining variables
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