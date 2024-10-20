package day14.encap;

public class Example1 {
	private int empID=101;
	private double salary=45000.58;
	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println(ref.empID);
		System.out.println(ref.salary);
	}
	public int getEmpID() {
		return empID;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setEmpID(int empID) {
		this.empID=empID;
	}
	public void setSalary(double salary) {
		this.salary=salary;
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