package day7.methodoverloading;

public class Cons3 {
	//this class has user defined constructor
	Cons3(){
		System.out.println("I am zero=param cons");
		empid=101;
	}
	
	int age=25,empid;
	public static void main(String[] args) {
		Cons3 ref=new Cons3();
		System.out.println(ref.age);
		System.out.println(ref.empid);

	}

}
/*
its similar to a method but,
    * its name should be same as class
    * its won't have return type so won;t return any value

its is used to initialize non-static member of the class into the object memory

type:
   1. default constructor - written by java compiler
   		only when class doesn't have any constructor
   		this constructor won't be having any parameter and its body will be empty
   2. user defined constructor


*/