package day14.encap;

public class Example2 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		//not allowed to access private members from outside the class directly
//		System.out.println(ref.empID);
//		System.out.println(ref.salary);
		
		System.out.println(ref.getEmpID());
		System.out.println(ref.getSalary());
		System.out.println("*******************Update private data member from outside the class***********************");
		ref.setEmpID(1001);
		ref.setSalary(65000.48);
		System.out.println(ref.getEmpID());
		System.out.println(ref.getSalary());
	}
}
