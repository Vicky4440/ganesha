package logical;

import java.util.Scanner;

public class FactorialOFNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("give the input string");
		
		int vp = sc.nextInt();
//revrse dirction
		int fact=1;
		for(int i=vp;i>=1;i--) {
			fact=i*fact;
			
		}
		System.out.println(fact);
		
		
		
		
		
		int s=5;
		int  fact1=1;
		for(int i=5;i>=1;i--) {
			fact1=i*fact1;
		}
		
		System.out.println(fact1);
		
		
		
		
		
		
		
	}

	
	
	
}
