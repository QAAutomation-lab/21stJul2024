package day2.localvariables;

public class VariableTypes 
{
	//global variable
	static int age=30;//static global variable / class variable
	double salary=25000.56;//non-static global variable / instance variable
	public static void main(String[] args)
	{
		System.out.println("Program starts");
		//local variable
		int num1=25;
		System.out.println("num1: "+num1);
		//static global variable
		System.out.println("SGV age: "+age); //or
		System.out.println("SGV with standard age: "+VariableTypes.age);
		//non-static global variable
//		VariableTypes ref1;
//		ref1=new VariableTypes();
			//or
		VariableTypes ref=new VariableTypes();
		System.out.println("NSGV salary: "+ref.salary);
		System.out.println("Program ends");
	}
}
/*
1. non-static global variable or instance variable:
	* a variable declared outside the method/constructor body without static keyword known as non-static global variable.
	* these variables are also know an instance variable because they are loaded into the object memory at time of execution
	  when instance/object of a class is created.
	* instance/object: its a real world entity that has its own behavior/state
			classname referenanceVariable;//declaration
			referenanceVariable =new classname();//initialization
			VariableTypes ref;
			ref=new VariableTypes();
				//or
			classname referenanceVariable=new classname();
			VariableTypes ref=new VariableTypes();
	* visibility/accessibility: can be access from anywhere using following ways-
		a. these variables can be access from another non-static method directly(recommended within same class)
				System.out.println(age);
				age=25;
		b. standard: always use instance/object to access these variables
				classname referenanceVariable=new classname();
				VariableTypes ref=new VariableTypes();
				System.out.println(ref.age);
				ref.age=25;
	* memory: these variable gets a multiple memory allocation based on object/instance creation
	* a change made in one instance won;t impact another instance
				
1. static global variable or class variable:
	* a variable declared outside the method/constructor body with static keyword known as static global variable.
	* these variables are also known as class variable because they are loaded into the memory automatically at the time
	  of compilation when .class file is getting generated.
	* visibility/accessibility: can be access from anywhere using following ways-
		a. these variables can be access from another static method directly(recommended within same class)
				System.out.println(age);
				age=25;
		b. standard: always use classname to access these variables
				classname.staticglobalvariable
				System.out.println(VariableTypes.age);
				VariableTypes.age=25;
	* memory: these variable gets a single/one time separate memory
	* default value: there is default value based on datatype is globale variables are declared and used without
					 initialization.
					- byte,short,int,long default value is '0'
					- float, double default value is 0.0
					- char default value is blank space(' ')
					- boolean default value is false

global variable:
	* a variable declared outside the method/constructor body known as global variable.
	* default value: there is default value based on datatype is globale variables are declared and used without
					 initialization.
					- byte,short,int,long default value is '0'
					- float, double default value is 0.0
					- char default value is blank space(' ')
					- boolean default value is false
	* types:
		1. static global variable or class variable
		2. non-static global variable or instance variable

local variable:
	* a variable declared inside the method/constructor body known as local variable.
	* Visibility/accessibility: these variables are accessible with in method/constructor body, not from outside
	* memory: no separate memory allocation
	* static keyword: we can't use static keyword with local variable
	* default value: no default value for local variable, when we declare a local variable and try to use it without
				   initialization then you will get compile time error.
*/