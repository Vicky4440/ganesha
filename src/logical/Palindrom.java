package logical;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.println("give the string");
		 
		 String vp=sc.next();
		 String rev="";
		 for(int i=vp.length()-1;i>=0;i--) {
			 rev=rev+vp.charAt(i);
			 
		 }
		System.out.println("actual string is "+vp);
		System.out.println("Reverse string is "+rev);
		
		if(vp.equals(rev)) {
			System.out.println("string is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}
	}

}
