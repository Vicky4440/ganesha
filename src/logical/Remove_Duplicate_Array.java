package logical;

import java.util.HashMap;

public class Remove_Duplicate_Array {

	public static void main(String[] args) {
		 int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		 
		 HashMap<Integer, Integer>hs=new HashMap<Integer,Integer>();
		 
		 for(int vp:arr) {
			 
			 
			 if(hs.containsKey(vp)) {
				 hs.put(vp, hs.get(vp)+1);
				 
			 }
			 else {
				 hs.put(vp, 1);
				 
			 }
			  
			 
		 }
		 System.out.println(hs);
		 	 
}
}