package logical;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("give the int value");
		
		int vp = sc.nextInt();
		
		int num=0;
		
		for(int i=vp;i>0;i=i/10) {
			
			int num1=i%10;
			num= num+(num1*num1*num1);
			
		}
		System.out.println("orignal int "+vp);
		System.out.println("additonal digit cube "+num);
		
		if(vp==num) {
			System.out.println("this is arm strong");
		}
		else {System.out.println("this is not arm strong");}
		
	}

}
