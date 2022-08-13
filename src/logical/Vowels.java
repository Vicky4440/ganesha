package logical;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		String str = new String("vikram");
//	      for(int i=0; i<str.length(); i++) {
//	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//	            System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
//	         }
//	      }
		
		
		
		
		
		
		
		
		String st="Vikram";
		
		// || using logical or operator
		
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				System.out.println("Given string contains "+ st.charAt(i)+ " at the index "+i);
				
			}
			
			
		}
	}

}
