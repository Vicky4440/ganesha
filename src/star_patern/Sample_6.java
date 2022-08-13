package star_patern;

public class Sample_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//    *
		//   * *
		//  * * *
		// * * * *
       // * * * * *

		  //row =5;col=5;star=1;space=4;
		int star= 1;
		int space= 4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++) {
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space=space-1;
		}
		
		
		// *
		// ***
		// *****
		// *******
		//star 1 row 4
		
		int s = 1;
		int sp=5;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("");
			}
			for(int k=1;k<=s;k++) {
				System.out.print("*");
			}
			System.out.println();
			s=s+2;
			
		}
		
		
		
		
		

	}

}
