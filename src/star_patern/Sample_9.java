package star_patern;

public class Sample_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// *        *
		// **      **
		// ***    ***
		// ****  ****
		// **********
		// ****  ****
		// ***    ***
		// **      **
		// *        *
		
		
		
		
		//row=9;star=1;col=5
		
		int star=1;
		int star1=1;
		int space=4;
		int space1=4;
		
		for(int i=1;i<=9;i++ ) {
			for(int j=1;j<=space;j++) {
				System.out.print("");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			for(int j=1;j<=space1;j++) {
				System.out.print("");
			}
			for(int k=1;k<=star1;k++)
			{System.out.print("*");}
			System.out.println();
			if(i<5) {
				star++;
				space--;
				star1--;
				space1++;
			}
			else {
				star--;
				star1++;
				space++;
				space1--;
			}
		}
	}

}
