package logical;

import java.util.Scanner;

public class String_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		  System.out.println("give the string");
		  
		  String vp= sc.next();
		  String rev= "";
		  for (int i=vp.length()-1;i>=0;i--) {
			  
			  rev=rev+vp.charAt(i);
		  }
		  System.out.println("Revrse string "+rev);
	}

}
