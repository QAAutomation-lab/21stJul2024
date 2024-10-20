package day3.variableTypes;

public class NonStaticGlobalVariableExample1 {
	int num1,num2;
	public static void main(String[] args) {
		System.out.println("Program Starts");
//		System.out.println("NSGV num1: "+num1);//compile time error as these variable are not available in memory
//		System.out.println("NSGV num1: "+num2);//compile time error as these variable are not available in memory
	
		/*To access non-static member, 1st we need to load them into the memory for that create an instance of the class*/
		NonStaticGlobalVariableExample1 ref1;//Object/instance declaration
		ref1=new NonStaticGlobalVariableExample1();//Object/instance initialization
		
		System.out.println("NSGV num1 with ref1 object: "+ref1.num1);
		System.out.println("NSGV num2 with ref1 object: "+ref1.num2);
		
		ref1.num1=20;
		ref1.num2=50;
		int result=ref1.num1+ref1.num2;
		System.out.println("After initialization, NSGV num1 with ref1 object: "+ref1.num1);
		System.out.println("After initialization, NSGV num2 with ref1 object: "+ref1.num2);
		System.out.println("Result: "+result);
		System.out.println("Program Ends");
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
				
*/