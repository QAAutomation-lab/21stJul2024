package assignments;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("is given number armstrong? "+isNumberArmstrong(153));
	}
	
	static boolean isNumberArmstrong(int num) {
		System.out.println("Original number is "+num);
		int temp=0, rem=0, dup=num;
		while(num>0) {
			rem=num%10;//3 | 5 | 1
			temp=temp+rem*rem*rem;//27 | 27+5*5*5=152 | 152+1=153
			num=num/10;//15 | 1 | 0
		}
		if(dup==temp) {
			return true;
		}else {
			return false;
		}
	}
}
