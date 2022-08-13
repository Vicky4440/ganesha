package logical;

import java.util.Arrays;

public class Missing_No_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,6,7,8,10};
    int first; 
	 first=a[0];

		
 
		 for(int i=1;i<a.length;i++){ 
			 if(a[i]==(first+1)){
		 

		first=a[i];

	

		 } else{

			 System.out.println("missing = "+(first+1));

			

			break;
		
			
		}
		
		 }
}
}