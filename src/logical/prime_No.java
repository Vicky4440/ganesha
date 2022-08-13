
package logical;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class prime_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	     System.out.println("entr int value");
	     int vp = sc.nextInt();
		
	     int count=0;
	     
	     for(int i=2;i<vp;i++) {
	    	 
	    	 if(vp%i==0) {
	    		 count++;
	    		 break;
	    	 }
	    	
	    	
	     }
	     if(count==0) 
	     {System.out.println("this prime no");}
	     
    	 else {System.out.println("not a prime no");}
    	System.out.println("**********************************");
    	
    	
    	
    	
    	
    	 int []ar= {1,12,14,1,14,15};
    	 
    	 Arrays.sort(ar);
    	 
    	
    		 
    	 }
    	 
	}


