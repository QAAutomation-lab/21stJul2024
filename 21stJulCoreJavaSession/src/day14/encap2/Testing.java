package day14.encap2;

import day14.encap.Example1;

public class Testing {
	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println(ref.getEmpID());
		System.out.println(ref.getSalary());
		
		ref.setEmpID(5005);
		ref.setSalary(87000.36);
		System.out.println(ref.getEmpID());
		System.out.println(ref.getSalary());
	}
}
/*
setter: its a method that will help you to modify private data members from outside the class
		access modifier: public
		return type: void
		name: can be anything but better to start with 'set' i.e: setEmpID()
		parameter: based on private variable data type
		return value: NA
 
getter: its a method that will help you to access private data members from outside the class
		access modifier: public
		return type: based on private variable data type
		name: can be anything but better to start with 'get' i.e: getEmpID()
		parameter: NA
		return value: return required private variable

*/