package logical;

import java.util.Scanner;

public class If_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//factorial no
		//5 //5*4*3*2*1
		
		int num=5;
		int fact=1;
		
		for(int i=num ;i>=1;i--) {
			
			fact=i*fact;//5*1=5;
			            //4*5=20
			            //20*3=60
			            //60*2=120
		}
		System.out.println(fact);
		System.out.println("******************************************");
		
		//revese string
		
		String sc="Vikram";
		String op="";
		for(int i=sc.length()-1;i>=0;i--) {
			op=op+sc.charAt(i);
		}
		System.out.println(op);
	}
		
		
	}


