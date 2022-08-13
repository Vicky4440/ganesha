package logical;

import java.util.Scanner;

public class INT_ADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("give the int value");
		
		int a=sc.nextInt();
		System.out.println("give the int value");
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("value of sum "+sum);
		
		int sub =a-b;
		System.out.println("value of sub "+sub);
	}

}
