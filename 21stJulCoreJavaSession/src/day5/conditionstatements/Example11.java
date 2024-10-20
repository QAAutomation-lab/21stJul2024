package day5.conditionstatements;

public class Example11 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num=1;
		do {
			System.out.println(num);
		}while(num>20);
		System.out.println("********************************");
		num=5;
		do {
			System.out.println(num);
			num--;
		}while(num>0);
		System.out.println("Program ends");
	}

}
/*
while (boolean Condition)
{
	//code snippet…
}

*/